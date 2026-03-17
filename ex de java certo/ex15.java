import java.util.Scanner;

public class ex15 {
    public static void main (String[] args){
        Scanner coxinha =  new Scanner(System.in);
        String coxinhausuario = "r";
        int coxinhasenha = 1;

        System.out.println("informe o seu usuario ");
        String coxinha1 = coxinha.nextLine();

        System.out.println("informe sua senha ");
        int coxinha2 = coxinha.nextInt();


        String coxinha3 = (coxinhausuario == coxinha1 && coxinhasenha == coxinha2 )? "Acesso negado" : "acesso permitido";

        System.out.println(coxinha3);

        coxinha.close();

    }
}
