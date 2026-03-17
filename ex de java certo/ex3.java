import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner coxinha = new Scanner(System.in);

        System.out.println("digite a nota do aluno");
        double coxinha1 = coxinha.nextDouble();

        if (coxinha1 >= 7) {
            System.out.println("aprovado");
        } 
        else if (coxinha1 >= 5 && coxinha1 < 7) { 
            System.out.println("Recuperação");
        } 
        else {
            System.out.println("Reprovado");
        }

        coxinha.close();
    }
}

