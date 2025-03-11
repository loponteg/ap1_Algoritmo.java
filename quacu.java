import java.util.Scanner;

public class quacu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double n = scanner.nextDouble();

        double qua = n*n;

        double cu = n*n*n;

        System.out.println("o resultado ao quadrado é " +qua +" e ao cubo é "+cu);

    }
}
