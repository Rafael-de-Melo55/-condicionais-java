import java.util.Scanner;

public class Ex10 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = entrada.nextInt();

        String resultado = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Zero";

        System.out.println("O seu número é " + resultado);

        entrada.close();
    }
}