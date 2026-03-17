import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("--- Validador de Triângulos ---");
        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("É um triângulo válido!");

            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero (todos os lados iguais)");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles (dois lados iguais)");
            } else {
                System.out.println("Tipo: Escaleno (todos os lados diferentes)");
            }
        } else {
            System.out.println("Não é um triângulo válido (os lados não se fecham).");
        }

        scanner.close();
    }
}
