import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso : ");
        double p = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double a = scanner.nextDouble();

        double imc = p/(a*a);





        System.out.println("Seu imc é:" +imc );

    }
}