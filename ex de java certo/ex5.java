import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        double coxinharesultado;
        Scanner coxinha = new Scanner(System.in);

        System.out.println("informe o primeiro número ");
        double coxinha1 = coxinha.nextDouble();

        System.out.println("informe o segundo numero");
        double coxinha2 = coxinha.nextDouble();

        
        System.out.println("informe a operação: 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão");
        int coxinhaescolha = coxinha.nextInt();

        switch (coxinhaescolha) {
            case 1:
                coxinharesultado = coxinha1 + coxinha2;
                System.out.println("o resultado da soma é " + coxinharesultado);
                break;

            case 2:
                coxinharesultado = coxinha1 - coxinha2;
                System.out.println("o resultado da subtração é " + coxinharesultado);
                break;

            case 3:
                coxinharesultado = coxinha1 * coxinha2;
                System.out.println("o resultado da multiplicação é " + coxinharesultado);
                break;

            case 4:
                if (coxinha1 == 0 || coxinha2 == 0) {
                    System.out.println("impossível fazer a divisão");
                } else {
                    coxinharesultado = coxinha1 / coxinha2;
                    System.out.println("o resultado da divisão é " + coxinharesultado);
                }
                break;
        }
        
        coxinha.close();
    }
}