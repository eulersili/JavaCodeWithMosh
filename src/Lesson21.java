public class Lesson21 {
    public static void main(String[] args) {
        // The Ternary Operator
        // 01:53:46


        int income = 120_000;
        String className;
        if (income > 100_000){
            className = "First";
        }
        else {
            className = "Economy";
        }
        System.out.println(className);

//        int income = 120_000;
//        String className = "Economy";
//        if (income > 100_000){
//            className = "First";
//        }
//        System.out.println(className);

//        int income = 120_000;
//        String className = (income > 100_000) ? "First" : "Economy";
//        System.out.println(className);

//        int income = 120_000;
//        boolean className = (income > 100_000) ? true : false;
//        System.out.println(className);

    }
}
