import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Temperatura em fahrenheit: ");
        double f = scanner.nextDouble();

        double cel = (f - 32) / 1.8 ;



        System.out.println("A temperatura em celsius é: "+cel);
    }
}
