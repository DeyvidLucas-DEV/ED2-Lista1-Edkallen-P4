 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 class Complexo {
    private double parteReal; // Parte real do número complexo
    private double parteImaginaria; // Parte imaginária do número complexo

    // Construtor
    public Complexo(double a, double b) {
        this.parteReal = a;
        this.parteImaginaria = b;
    }

    // Método para ler um número complexo
    public static Complexo lerNumeroComplexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a parte real: ");
        double a = scanner.nextDouble();
        System.out.print("Digite a parte imaginária: ");
        double b = scanner.nextDouble();
        return new Complexo(a, b);
    }

    // Método para somar dois números complexos
    public Complexo somar(Complexo outro) {
        return new Complexo(this.parteReal + outro.parteReal, this.parteImaginaria + outro.parteImaginaria);
    }

    // Método para subtrair dois números complexos
    public Complexo subtrair(Complexo outro) {
        return new Complexo(this.parteReal - outro.parteReal, this.parteImaginaria - outro.parteImaginaria);
    }

    // Método para multiplicar dois números complexos
    public Complexo multiplicar(Complexo outro) {
        double real = (this.parteReal * outro.parteReal) - (this.parteImaginaria * outro.parteImaginaria);
        double imaginario = (this.parteReal * outro.parteImaginaria) + (this.parteImaginaria * outro.parteReal);
        return new Complexo(real, imaginario);
    }

    // Método para mostrar o número complexo na forma (a, b)
    @Override
    public String toString() {
        return String.format("(%f, %f)", parteReal, parteImaginaria);
    }
}

 public class ED2Lista1_questao21 {
    public static void main(String[] args) {
        Complexo numero1 = Complexo.lerNumeroComplexo();
        Complexo numero2 = Complexo.lerNumeroComplexo();

        Complexo soma = numero1.somar(numero2);
        Complexo subtracao = numero1.subtrair(numero2);
        Complexo multiplicacao = numero1.multiplicar(numero2);

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}