import java.util.Scanner;

public class ex4{

public static void main (String[] args){

    Scanner coxinhatemp = new Scanner (System.in);

    System.out.println("insira a temperatura ");
    int coxinha1 = coxinhatemp.nextInt();


    String coxinha2 = ( coxinha1 <= 15 ) ? " clima frio" : 

                      (coxinha1 >= 15 && coxinha1 <= 25  ) ? " clima agradável" : " clima quente";

    System.out.println("a temperatura faz o clima estar um " + coxinha2);


    coxinhatemp.close();
}
}