 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */
 import java.util.Scanner;

 public class ED2Lista1_questao01 {

    // Método recursivo para calcular a série
    public static double calcularSerie(int n) {
        // Caso base: quando n é igual a 1, retorna 1
        if (n == 1) {
            return 1.0;
        } else {
            // Chamada recursiva para calcular a parte anterior da série + n/1
            return calcularSerie(n - 1) + (double) n / 1.0;
        }
    }

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para calcular a série: ");
        int n = Scanner.nextInt(); 

        // Calcular o resultado da série até o termo n
        double resultado = calcularSerie(n);

    
        System.out.println("Resultado da série até n = " + n + " é: " + resultado);
    }
}