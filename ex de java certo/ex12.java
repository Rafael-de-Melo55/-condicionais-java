import java.util.Scanner;

public class ex12 {
    public static void main (String[] args){
        Scanner coxinha =  new Scanner(System.in);

        System.out.println("digite a nota do aluno");
        double coxinha1 = coxinha.nextDouble();

        if (coxinha1 >= 9) {
            System.out.println("A");
        } 
        else if (coxinha1 >= 7 && coxinha1 <= 8) { 
            System.out.println("B");
        } 
        else if (coxinha1 >= 5 && coxinha1 <= 6){
            System.out.println("C");
        }else if (coxinha1 >= 0 && coxinha1 <= 4){
            System.out.println("D");
        }

        coxinha.close();

    }
}
