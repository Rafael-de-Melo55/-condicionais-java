import java.util.Scanner;

public class ex14 {
    public static void main (String[] args){
        Scanner coxinha =  new Scanner(System.in);

        System.out.println("informe o primeiro numero ");
        int coxinha1 = coxinha.nextInt();

        System.out.println("informe o segundo numero numero ");
        int coxinha2 = coxinha.nextInt();

        System.out.println("informe o terceiro numero ");
        int coxinha3 = coxinha.nextInt();

        String coxinha4 = ( coxinha1 > coxinha2  && coxinha1 > coxinha3)? "o primeiro numero é maior do que os outros" :
        (coxinha2 > coxinha1 && coxinha2 > coxinha3)? "o segundo numero é maior" :
        (coxinha3 > coxinha1 && coxinha3 > coxinha2)? "o terceiro numero é maior" : "todos sao iguais";

        System.out.println(coxinha4);

        coxinha.close();

    }
}