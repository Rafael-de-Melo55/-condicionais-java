import java.util.Scanner;

public class ex18 {
    public static void main (String[] args){
        Scanner coxinha =  new Scanner(System.in);

        System.out.println("informe um numero para ser traduzido para estação do ano ");
        int coxinhaescolha = coxinha.nextInt();

    switch (coxinhaescolha) {
        case 1:
            System.out.println("é I");
            break;
        case 2:
            System.out.println("é II");
            break;
        case 3:
            System.out.println("é III");
            break;
        case 4:
            System.out.println("é IV");
            break;
        case 5:
            System.out.println("é V");
            break;
        case 6:
            System.out.println("é VI");
            break;
        case 7:
            System.out.println("é VII");
            break;
        case 8:
            System.out.println("é VIII");
            break;
        case 9:
            System.out.println("é IX");
            break;
        case 10:
            System.out.println("é X");
            break;
    }
        coxinha.close();

    }
}