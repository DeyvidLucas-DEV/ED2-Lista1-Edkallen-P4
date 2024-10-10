 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 public class ED2Lista1_questao20 {

    // Método para calcular e de forma recursiva
    public static double calculateE(int n) {
        // Calcular o fatorial de n
        double factorial = calculateFactorial(n);
        
        // Se o fatorial é zero, retornamos 1, que é a soma inicial
        if (n == 0) {
            return 1; // O primeiro termo é 1
        }

        // Se o próximo termo for menor que 1.0e-8, retorna 0 (não soma)
        double nextTerm = 1.0 / factorial;
        if (nextTerm < 1.0e-8) {
            return 0; // Não somar se o próximo termo for pequeno
        }

        // Retorna o próximo termo + chamada recursiva para o próximo n
        return nextTerm + calculateE(n + 1);
    }

    // Método para calcular o fatorial de um número
    public static double calculateFactorial(int n) {
        if (n == 0) {
            return 1; // 0! é 1
        }
        return n * calculateFactorial(n - 1); // Chamada recursiva
    }

    public static void main(String[] args) {
        double eApproximation = calculateE(0); // Começa a partir de 0
        System.out.printf("Aproximação de e: %.10f\n", eApproximation);
    }
}