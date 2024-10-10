 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;
 import java.util.HashSet;

 public class ED2Lista1_questao09 {

    // Método para gerar todas as permutações
    private static void permute(String str, String prefix, HashSet<String> result) {
        int n = str.length();
        if (n == 0) {
            result.add(prefix); // Adiciona a permutação resultante ao conjunto
        } else {
            for (int i = 0; i < n; i++) {
                // Chama recursivamente para as permutações restantes
                permute(str.substring(0, i) + str.substring(i + 1, n), prefix + str.charAt(i), result);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        HashSet<String> result = new HashSet<>(); // Para evitar duplicatas
        permute(input, "", result); // Chama o método de permutação

        // Exibe as permutações
        for (String permutation : result) {
            System.out.println(permutation);
        }

        System.out.println("Quantidade de permutações: " + result.size());

        scanner.close(); 
    }
}