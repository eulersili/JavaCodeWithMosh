import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) {
        // Exercise: FizzBuzz
        // 02:00:07

        // If number is divisible by 5 = Fizz
        // If number is divisible by 3 = Buzz
        // If number is divisible by 3 and 5 = FizzBuzz
        // If not, print the number

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0) {
//            System.out.println("Fizz");
//        }
//        else if (number % 3 == 0) {
//            System.out.println("Buzz");
//        }
//        else if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println("FizzBuzz");
//        }
//        else {
//            System.out.println(number);
//        }

        // The difference between these codes,
        // You should have the most specific condition on the top
        // and the most generic ones on the bottom.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if (number % 3 == 0 &&  number % 5 == 0) {
//            System.out.println("FizzBuzz");
//        }
//        else if (number % 5 == 0) {
//            System.out.println("Fizz");
//        }
//        else if (number % 3 == 0) {
//            System.out.println("Buzz");
//        }
//        else {
//            System.out.println(number);
//        }

        // Now, the difference is the repetition/duplication on the first "if statement"

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0) {
//            if (number % 3 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else {
//                System.out.println("Fizz");
//            }
//        }
//        else if (number % 3 == 0) {
//            System.out.println("Buzz");
//        }
//        else {
//            System.out.println(number);
//        }
    }
}
