import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner coxinha = new Scanner(System.in);

        System.out.println("Informe o primeiro numero ");
        int coxinha1 = coxinha.nextInt();

        System.out.println("Informe o segundo numero ");
        int coxinha2 = coxinha.nextInt();

        String coxinha3 = ( coxinha1 >= coxinha2 ) ? "o primeiro numero é maior que o segundo ou igual" : "o segundo numero é maior primeiro ou igual ";

        System.out.println(coxinha3);

        coxinha.close();

    }
}