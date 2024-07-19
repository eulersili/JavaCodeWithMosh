import java.util.Scanner;

public class Lesson27 {
    public static void main (String[] args){
        // Break and Continues
        // 02:15:36

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (!input.equals("quit")){
//                System.out.println(input);
//            }
//        }

        // Or:

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("quit")) {
//                break;
//            }
//            System.out.println(input);
//        }

        // The difference is on the "if" statement, but they've same results.


        // 02:17:12
        // ----------------------------------------

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass")){
//                continue;
//            }
//            if (input.equals("quit")) {
//                break;
//            }
//            System.out.println(input);
//        }

        // 02:18:05

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass")){
                continue;
            }
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }

        // If you are using "while (true)", make sure you have a "break"
        // statement in your loop.

    }
}
