 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;
 
 public class ED2Lista1_questao02 {

    // Método recursivo para somar os elementos do array
    public static double somarArray(double[] array, int indice) {
        // Caso base: se o índice for igual ao tamanho do array, retorna 0 (fim da recursão)
        if (indice == array.length) {
            return 0;
        } else {
            // Soma o elemento atual e chama a função recursivamente para o próximo índice
            return array[indice] + somarArray(array, indice + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        double[] array = new double[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextDouble();
        }

        double soma = somarArray(array, 0);

        System.out.println("A soma de todos os elementos do array é: " + soma);
    }
}
