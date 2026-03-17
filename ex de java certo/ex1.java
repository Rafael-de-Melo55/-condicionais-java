import java.util.Scanner;

public class ex1 {
 public static void main(String[] args) {
    Scanner coxinha = new Scanner(System.in);

    System.out.println("Informe um numero ");
    int coxinha1 = coxinha.nextInt();

    String coxinhaT = ( coxinha1 % 2 != 0 ) ? "o numero é par" : "o numero é impar";

    System.out.println("O numero é "+ coxinhaT);

    coxinha.close();

 }
}