 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 class Node {
    int data;      // Dado do nó
    Node next;    // Referência para o próximo nó

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

    // Método recursivo para contar o número de nós na lista
    public int countNodes(Node node) {
        // Caso base: se o nó atual é null, retorna 0
        if (node == null) {
            return 0;
        }
        // Chama recursivamente para o próximo nó e soma 1 para o nó atual
        return 1 + countNodes(node.next);
    }

    // Método para iniciar a contagem a partir do head
    public int countNodes() {
        return countNodes(head);
    }
}

 public class ED2Lista1_questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        // Solicita ao usuário a quantidade de elementos a serem adicionados à lista
        System.out.print("Digite o número de elementos que deseja adicionar à lista: ");
        int n = scanner.nextInt();

        // Adiciona os elementos à lista
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.add(data);
        }

        // Conta o número de nós na lista
        int count = list.countNodes();
        // Exibe o resultado
        System.out.println("O número total de nós na lista encadeada é: " + count);
    }
}