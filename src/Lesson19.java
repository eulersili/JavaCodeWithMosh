import java.util.Scanner;

public class Lesson19 {
    public static void main(String[] args) {
        // If Statements
        // 01:45:52

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the temperature: ");
        int temperature = scanner.nextInt();
        if (temperature >= 20) {
            System.out.println("It's a beautiful day!");
        }
        else if (temperature >= 30) {
            System.out.println("It's a hot day!");
            System.out.println("Drink water!");
        }
        else {
            System.out.println("It's a cold day!");
        }

    }
}
