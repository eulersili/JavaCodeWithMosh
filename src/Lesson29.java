import java.text.NumberFormat;
import java.util.Scanner;

public class Lesson29 {
    public static void main(String[] args) {
        // Project: Mortgage Calculator
        // 02:21:59

        final byte MOTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal;
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000){
                break;
            }
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        float annualInterest;
        float monthlyInterest;
        while (true) {
            System.out.print("Annual Interest Rate (1 - 30): ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / PERCENT / MOTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal 100");
        }

        byte years;
        int numberOfPayments;
        while (true) {
            System.out.print("Period/Years (1 - 30): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30){
                numberOfPayments = years * MOTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a year between 1 and 30");
        }

        double mortgage = principal
                * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.printf("Mortgage: %s", mortgageFormatted);
    }
}
