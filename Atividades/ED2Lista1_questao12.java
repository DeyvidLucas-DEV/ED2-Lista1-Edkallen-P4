 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 public class ED2Lista1_questao12 {

    // Método principal para verificar se A[i] = A[j] + A[k] para j, k < i
    public static boolean checkSum(int[] array, int index) {
        // Caso base: se o índice for menor que 2, não há dois elementos anteriores
        if (index < 2) {
            return false;
        }

        // Verifica se A[index] é a soma de dois elementos anteriores
        if (isSum(array, index - 1, array[index])) {
            return true;
        }

        // Chama recursivamente para o próximo índice
        return checkSum(array, index - 1);
    }

    // Método auxiliar para verificar se existe A[j] + A[k] = target
    private static boolean isSum(int[] array, int endIndex, int target) {
        for (int j = 0; j < endIndex; j++) {
            for (int k = j + 1; k < endIndex; k++) {
                if (array[j] + array[k] == target) {
                    return true; // Encontra a soma
                }
            }
        }
        return false; // Não encontrou soma
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Verifica se existe um A[i] que é a soma de dois elementos anteriores
        boolean result = checkSum(array, n - 1);
        if (result) {
            System.out.println("O array contém um elemento que é a soma de dois elementos anteriores.");
        } else {
            System.out.println("O array não contém tal elemento.");
        }

        scanner.close(); 
    }
}