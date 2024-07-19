public class Lesson22 {
    public static void main(String[] args) {
        // Switch Statements
        // 01:56:16

//        String role = "admin";
//        if (role == "admin"){
//            System.out.println("You're an admin!");
//        }
//        else if (role == "moderator") {
//            System.out.println("You're a moderator!");
//        }
//        else {
//            System.out.println("You're a guest!");
//        }

//        String role = "moderator";
//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin!");
//                break;
//            case "moderator":
//                System.out.println("You're a moderator!");
//                break;
//            default:
//                System.out.println("You're a guest!");
//        }

        // As you can see, with switch statement we can execute different code, depending
        // on the value of the expression.

        int role = 1;
        switch (role) {
            case 1:
                System.out.println("You're an admin!");
                break;
            case 2:
                System.out.println("You're a moderator!");
                break;
            default:
                System.out.println("You're a guest!");
        }
    }
}
