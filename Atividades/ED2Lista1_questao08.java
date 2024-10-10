 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */
 import java.util.Scanner;
 
 class Node {
    int data; // Dado do nó
    Node next; // Referência para o próximo nó

    public Node(int data) {
        this.data = data;
        this.next = null; // Inicialmente, o próximo nó é null
    }
}

 class LinkedList {
    Node head; // Cabeça da lista

    // Método para adicionar um novo nó ao final da lista
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // Se a lista estiver vazia, o novo nó é o head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Navega até o último nó
            }
            current.next = newNode; // Adiciona o novo nó ao final
        }
    }

    // Método para contar o número de nós na lista
    public int countNodes() {
        return countNodes(head);
    }

    // Método recursivo auxiliar para contar nós
    private int countNodes(Node node) {
        // Caso base: se o nó atual é null, retorna 0
        if (node == null) {
            return 0;
        }
        // Chama recursivamente para o próximo nó e soma 1 para o nó atual
        return 1 + countNodes(node.next);
    }

    // Método para inverter a lista encadeada
    public void invert() {
        head = invert(head);
    }

    // Método recursivo auxiliar para inverter a lista
    private Node invert(Node node) {
        // Caso base: se o nó atual é null ou é o último nó
        if (node == null || node.next == null) {
            return node;
        }

        // Inverte a lista recursivamente
        Node newHead = invert(node.next);
        node.next.next = node; // Inverte a referência do próximo nó
        node.next = null; // Define o próximo do nó atual como null

        return newHead; // Retorna a nova cabeça da lista invertida
    }

    // Método para exibir a lista
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // Indica o final da lista
    }
}

 public class ED2Lista1_questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Digite o número de elementos que deseja adicionar à lista: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.add(data);
        }

        // Exibe a lista original
        System.out.println("Lista original:");
        list.display();

        // Inverte a lista
        list.invert();

        System.out.println("Lista invertida:");
        list.display();

        scanner.close(); 
    }
}