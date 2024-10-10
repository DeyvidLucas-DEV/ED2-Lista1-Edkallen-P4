 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 public class ED2Lista1_questao04 {

    // Método recursivo para contar quantas vezes o dígito K ocorre em N
    public static int contarDigito(long N, long K) {
        // Caso base: se N for 0, retorna 0 (nenhum dígito para contar)
        if (N == 0) {
            return 0;
        }

        // Verifica se o último dígito de N é igual a K
        long ultimoDigito = N % 10;

        // Chamada recursiva, removendo o último dígito de N
        if (ultimoDigito == K) {
            return 1 + contarDigito(N / 10, K); // Se o dígito for K, adiciona 1 à contagem
        } else {
            return contarDigito(N / 10, K); // Caso contrário, não adiciona à contagem
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número N: ");
        long N = scanner.nextInt();

        System.out.print("Digite o dígito K: ");
        long K = scanner.nextInt();

        long contagem = contarDigito(N, K);

        System.out.println("O dígito " + K + " ocorre " + contagem + " vezes no número " + N + ".");
    }
}