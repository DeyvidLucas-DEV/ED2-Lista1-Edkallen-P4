 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 public class ED2Lista1_questao11 {

    // Método para criptografar a mensagem
    public static String encrypt(String message, int shift) {
        StringBuilder encrypted = new StringBuilder();
        
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                // Aplica a Cifra de César
                character = (char) ((character + shift - base) % 26 + base);
            }
            encrypted.append(character);
        }
        return encrypted.toString();
    }

    // Método para descriptografar a mensagem
    public static String decrypt(String message, int shift) {
        return encrypt(message, 26 - shift); // Inverte o deslocamento
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da mensagem
        System.out.print("Digite a mensagem: ");
        String message = scanner.nextLine();

        // Entrada do deslocamento
        System.out.print("Digite o valor do deslocamento (1-25): ");
        int shift = scanner.nextInt();
        shift = shift % 26; // Normaliza o deslocamento para o intervalo 0-25

        // Criptografa a mensagem
        String encryptedMessage = encrypt(message, shift);
        System.out.println("Mensagem criptografada: " + encryptedMessage);

        // Descriptografa a mensagem
        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Mensagem descriptografada: " + decryptedMessage);

        scanner.close(); // Fecha o scanner
    }
}