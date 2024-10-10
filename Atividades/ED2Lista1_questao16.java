 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 public class ED2Lista1_questao16 {
    
    // Método recursivo para calcular a soma dos primeiros N inteiros positivos
    public static int sum(int n) {
        // Caso base: se N é 0, a soma é 0
        if (n == 0) {
            return 0;
        }

        // Chamada recursiva: N + soma(N - 1)
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int n = scanner.nextInt();

        // Verifica se o número é negativo
        if (n < 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int result = sum(n);
            System.out.println("A soma dos primeiros " + n + " inteiros positivos é: " + result);
        }

        scanner.close();
    }
}