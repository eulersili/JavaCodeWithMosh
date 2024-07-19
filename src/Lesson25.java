import java.util.Locale;
import java.util.Scanner;

public class Lesson25 {
    public static void main(String[] args) {
        // While Loops
        // 02:09:52

//        int i;
//        for (i = 5; i > 0; i--){
//            System.out.println("Hello, World! " + i);
//        }

//        int i = 5;
//        while (i > 0 ){
//            System.out.println("Hello, World! " + i);
//            --i;
//        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
//            System.out.println(input);
        }

//        Scanner scanner = new Scanner(System.in);
//        String resposta = "S";
//        while (resposta.equals("S")){
//            System.out.print("Qual é a sua resposta [S/N]?: ");
//            resposta = scanner.next().toUpperCase();
//            System.out.println(resposta);
//        }

        /*

        --- while (input == "quit") ---
        This code is not going to work, because "input" is a String.
        It's a Reference Type, and we can not use comparison operator
        between References Type. Because this operator will compare the
        address or the String object, not the value.

        So, if you have two strings "quit" and "quit" but stored in different
        memory locations, have different addresses.

        So, we can not use inequality operator (!= , an exclamation point,
        followed by an equal sign) to compare the value. Instead, we
        need to use the "equals" method of String objects.

         */
    }
}
