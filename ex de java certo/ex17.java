import java.util.Scanner;

public class ex17 {
    public static void main (String[] args){
        double coxinhatotal1;
        double coxinhatotal2;
        Scanner coxinha = new Scanner(System.in);

        System.out.println("informe o valor da compra ");
        double coxinha1 = coxinha.nextInt();
        
        if (coxinha1 >= 500) {
            coxinhatotal1 = ( coxinha1 * 0.2);
            coxinhatotal2 = (coxinha1 - coxinhatotal1);
            System.out.println("o valor da compra sem desconto é "+ coxinha1 + " e o valor com desconto é " + coxinhatotal2);
        } 
        else if (coxinha1 >= 200 && coxinha1 <= 500) { 
            coxinhatotal1 = ( coxinha1 * 0.1);
            coxinhatotal2 = (coxinha1 - coxinhatotal1);
            System.out.println("o valor da compra sem desconto é "+ coxinha1 + " e o valor com desconto é " + coxinhatotal2);
        } 
        else if (coxinha1 <= 200){
            System.out.println("nao tem desconto");
        }
        coxinha.close();

    }
}