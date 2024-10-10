 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;
 
 public class ED2Lista1_questao05 {

    // Método recursivo para calcular o módulo
    public static int mod(int x, int y) {
        // Caso base: se x é igual a y, o resto é 0
        if (x == y) {
            return 0;
        }
        // Caso base: se x é menor que y, o resto é x
        else if (x < y) {
            return x;
        }
        // Caso recursivo: x é maior que y
        else {
            return mod(x - y, y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x (inteiro positivo): ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de y (inteiro positivo): ");
        int y = scanner.nextInt();

        // Verifica se ambos os valores são positivos
        if (x > 0 && y > 0) {
            // Chama o método recursivo para calcular o módulo
            int resultado = mod(x, y);
    
            System.out.println("O resto da divisão de " + x + " por " + y + " é: " + resultado);
        } else {
            System.out.println("Ambos os valores devem ser inteiros positivos.");
        }
    }
}