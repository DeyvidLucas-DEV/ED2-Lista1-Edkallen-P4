 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 public class ED2Lista1_questao18 {

    // Método recursivo para verificar se uma string é um palíndromo
    public static boolean isPalindrome(String str) {
        // Caso base: se a string tem 0 ou 1 caractere
        if (str.length() <= 1) {
            return true;
        }

        // Verifica se o primeiro e o último caractere são iguais
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Chama recursivamente para a substring entre os dois caracteres
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false; // Não é um palíndromo
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine().trim(); // Lê a entrada e remove espaços em branco

        // Chama a função e exibe o resultado
        if (isPalindrome(input)) {
            System.out.println(input + " é um palíndromo.");
        } else {
            System.out.println(input + " não é um palíndromo.");
        }

        scanner.close();
    }
}