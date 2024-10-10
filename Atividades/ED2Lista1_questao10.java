 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Random;

 public class ED2Lista1_questao10 {
    
    // Método recursivo para encontrar o menor e o maior valor
    public static void findMinMax(int[] arr, int index, int[] minMax) {
        // Caso base: se o índice for igual ao tamanho do array, retorna
        if (index == arr.length) {
            return;
        }

        // Atualiza o menor e o maior valor se necessário
        if (arr[index] < minMax[0]) {
            minMax[0] = arr[index]; // Atualiza o menor valor
        }
        if (arr[index] > minMax[1]) {
            minMax[1] = arr[index]; // Atualiza o maior valor
        }

        // Chama recursivamente para o próximo índice
        findMinMax(arr, index + 1, minMax);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = 100; // 
        int[] arr = new int[n];

        // Gera o array com valores aleatórios entre 1 e 1.000.000
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1_000_000) + 1; // +1 para garantir que seja entre 1 e 1.000.000
        }

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Array para armazenar o menor e o maior valor [menor, maior]
        int[] minMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};

        // Chama o método recursivo para encontrar o menor e o maior valor
        findMinMax(arr, 0, minMax);

        System.out.println("Menor valor: " + minMax[0]);
        System.out.println("Maior valor: " + minMax[1]);
    }
}