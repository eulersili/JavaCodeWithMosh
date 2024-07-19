import java.text.NumberFormat;

public class Lesson14 {
    public static void main(String[] args) {
        // Formatting Numbers

        // This (It's used when we got multiple case):
        // Note: this is an "object", like: NumberFormat currency = new NumberFormat();
        // ...but with more option to use.

//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);

        // Or (It's used when we got one case):
//        String result = NumberFormat.getCurrencyInstance().format(1234567.891);
//        System.out.println(result);

        // ---------------------------------------------------------------

        // This (It's used when we got multiple case):
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(1);
//        System.out.println(result);

        // Or (It's used when we got one case):
//        String result = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result);

    }
}