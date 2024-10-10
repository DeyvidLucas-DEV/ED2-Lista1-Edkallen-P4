 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 public class ED2Lista1_questao15 {
    
    // Método recursivo para multiplicar dois números
    public static int multiply(int a, int b) {
        // Caso base: se b é 0, o resultado da multiplicação é 0
        if (b == 0) {
            return 0;
        }
        
        // Se b é negativo, convertemos o problema em positivo
        if (b < 0) {
            return -multiply(a, -b);
        }

        // Chamada recursiva: a + (a multiplicado por (b-1))
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o segundo número (b): ");
        int b = scanner.nextInt();

        int result = multiply(a, b);
        System.out.println("Resultado de " + a + " * " + b + " = " + result);
        
        scanner.close();
    }
}