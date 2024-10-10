 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 public class ED2Lista1_questao13 {

    // Método principal para verificar se a string tem mais vogais que consoantes
    public static boolean hasMoreVowelsThanConsonants(String str) {
        int[] counts = countVowelsAndConsonants(str, 0, 0, 0);
        return counts[0] > counts[1]; // Retorna true se mais vogais que consoantes
    }

    // Método recursivo para contar vogais e consoantes
    private static int[] countVowelsAndConsonants(String str, int index, int vowelCount, int consonantCount) {
        // Caso base: se o índice atingir o comprimento da string
        if (index == str.length()) {
            return new int[]{vowelCount, consonantCount}; // Retorna os contadores
        }

        char ch = Character.toLowerCase(str.charAt(index)); // Obtém o caractere atual em minúsculas

        // Verifica se é uma vogal ou consoante
        if (isVowel(ch)) {
            vowelCount++;
        } else if (Character.isLetter(ch)) {
            consonantCount++;
        }

        // Chama recursivamente para o próximo caractere
        return countVowelsAndConsonants(str, index + 1, vowelCount, consonantCount);
    }

    // Método para verificar se um caractere é uma vogal
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine(); 

        // Verifica se a string tem mais vogais que consoantes
        boolean result = hasMoreVowelsThanConsonants(input);
        if (result) {
            System.out.println("A string tem mais vogais do que consoantes.");
        } else {
            System.out.println("A string não tem mais vogais do que consoantes.");
        }

        scanner.close(); 
    }
}