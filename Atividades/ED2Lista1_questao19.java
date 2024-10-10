 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 public class ED2Lista1_questao19 {

    // Método para calcular os coeficientes binomiais usando a relação de recorrência
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // C(n, 0) e C(n, n) são 1
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo n < 10: ");
        int n = scanner.nextInt();

        // Verifica se n está dentro do limite
        if (n < 1 || n >= 10) {
            System.out.println("O número deve ser um inteiro positivo menor que 10.");
            return;
        }

        // Construindo e imprimindo o polinômio (x + 1)^n
        System.out.print("(x + 1)^" + n + " = ");
        for (int k = 0; k <= n; k++) {
            int coefficient = binomialCoefficient(n, k);
            // Formatação da saída
            if (k == n) {
                System.out.print(coefficient); // último termo
            } else {
                System.out.print(coefficient + "x^" + (n - k) + " + ");
            }
        }
        System.out.println();

        scanner.close();
    }
}