import java.util.Scanner;

public class ex11 {
    public static void main (String[] args){
        Scanner coxinha =  new Scanner(System.in);

        System.out.println("Bem vindo ao cinema!, informe sua idade ");
        int coxinha1 = coxinha.nextInt();

        String coxinha2 = ( coxinha1 <= 12 )? "voce pagará 12 reais de ingresso" :
        (coxinha1 >= 12 && coxinha1 <= 60 ) ? "voce pagará 20 reais" : "voce pagará 10 reais"; 

        System.out.println(coxinha2);

        coxinha.close();

    }
}
