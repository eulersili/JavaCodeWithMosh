import java.util.Scanner;

public class Lesson26 {
    public static void main (String[] args){
        // Do... While Loops
        // 02:14:19

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

// ---------------------------------------

//        Scanner scanner = new Scanner(System.in);
//        String resposta = "S";
//        while (resposta.equals("S")) {
//            System.out.print("Qual é a sua resposta [S/N]?: ");
//            resposta = scanner.next().toUpperCase();
//            System.out.println(resposta);
//        }

//        Scanner scanner = new Scanner(System.in);
//        String resposta = "S";
//        do{
//            System.out.print("Qual é a sua resposta [S/N]?: ");
//            resposta = scanner.next().toUpperCase();
//            System.out.println(resposta);
//        } while (resposta.equals("S"));
    }
}
