import java.text.NumberFormat;
import java.util.Scanner;

public class Lesson16 {
    public static void main(String[] args) {
        // Project: Mortgage Calculator
        // 01:30:45

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();

        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.printf("Mortgage: %s", mortgageFormatted);

        // M = P ((r (1 + r) ** n) / (1 + r) ** n -1)

        // M = ?
        // P = $100,000 -> Principal
        // r = 0.005 (Year(s) / 12) -> Annual Interest Rate (monthly)
        // n = 180 days (/ 4) -> Number Of Payments
    }
}
