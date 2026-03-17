import java.util.Scanner;

public class ex19 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a velocidade do veículo: ");
        double velocidade = entrada.nextDouble();
        System.out.println("Informe o limite da via: ");
        double limite = entrada.nextDouble();

        double excesso = velocidade - limite;

        if (velocidade <= limite) {
            System.out.println("Sem multa");
        } else if (excesso <= limite * 0.20) {
            System.out.println("Multa leve");
        } else if (excesso <= limite * 0.50) {
            System.out.println("Multa grave");
        } else {
            System.out.println("Multa gravíssima + suspensão");
        }

        entrada.close();
    }
}