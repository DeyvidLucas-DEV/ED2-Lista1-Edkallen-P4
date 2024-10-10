 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */
 import java.util.Scanner;
 import java.util.InputMismatchException;
 
 public class ED2Lista1_questao03 {

    // Método recursivo para inverter o array
    public static void inverterArray(int[] array, int inicio, int fim) {
        // Caso base: se os índices se encontrarem ou ultrapassarem, a inversão está concluída
        if (inicio >= fim) {
            return;
        }

        // Troca o elemento da posição 'inicio' com o elemento da posição 'fim'
        int temp = array[inicio];
        array[inicio] = array[fim];
        array[fim] = temp;

        // Chama recursivamente para inverter os próximos elementos
        inverterArray(array, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 0;

        // Solicitar o tamanho do array com validação
        while (true) {
            try {
                System.out.print("Digite o tamanho do array: ");
                tamanho = Integer.parseInt(scanner.nextLine());

                if (tamanho > 0) {
                    break;  // Sai do loop se o tamanho for válido
                } else {
                    System.out.println("O tamanho deve ser um número inteiro positivo.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }

        // Criar o array de inteiros
        int[] array = new int[tamanho];

        // Preencher o array com valores inseridos pelo usuário com validação
        for (int i = 0; i < tamanho; i++) {
            while (true) {
                try {
                    System.out.print("Digite o elemento " + (i + 1) + ": ");
                    array[i] = Integer.parseInt(scanner.nextLine());
                    break;  // Sai do loop se a entrada for válida
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                }
            }
        }

        // Inverter o array usando o método recursivo
        inverterArray(array, 0, tamanho - 1);

        System.out.println("Array invertido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
    }
}