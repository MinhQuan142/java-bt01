import java.util.Scanner;

public class moneyconver {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the amount of USD you want to convert to VND.");



        int usd = scanner.nextInt();
int exchangeRate =25422;
int conver = exchangeRate * usd;
        System.out.println(usd + "USD = " + conver + "VND");

    }
}