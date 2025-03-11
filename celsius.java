import java.util.Scanner;

public class celsius {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Temperatura em celsius: ");
        double c = scanner.nextDouble();

        double f = c * 1.8 + 32 ;



        System.out.println("A temperatura em fahrenheit é: " + f);
    }
}