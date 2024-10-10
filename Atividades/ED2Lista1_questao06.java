 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;
 
 public class ED2Lista1_questao06 {

    // Método recursivo para inverter uma string
    public static String inverterString(String str) {
        // Caso base: se a string estiver vazia, retorna uma string vazia
        if (str.isEmpty()) {
            return str;
        }
        // Retorna o último caractere concatenado com a inversão do restante da string
        return str.charAt(str.length() - 1) + inverterString(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase para inverter: ");
        String input = scanner.nextLine();

        // Chama o método recursivo para inverter a string
        String resultado = inverterString(input);

        System.out.println("O inverso de \"" + input + "\" é \"" + resultado + "\".");
    }
}