import java.util.Scanner;

public class triângulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double al = scanner.nextDouble();

        double area = b*al/2;

        System.out.println("A area do triângulo é "+area);




    }


}
