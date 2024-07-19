public class Lesson02 {
    public static void main(String[] args) {
        byte age = 30;

        long viewCount1 = 123456789; // Normal way
        long viewCount2 = 123_456_789; // "_" is used to make more readable
        long viewCount3 = 123456789L; // Isn't necessary to use the letter "L"
        long viewCount4 = 123_456_789L; // Both concepts above.

        long viewCount5 = 3123456789L; // We add the letter "L" when the number is higher than 9 digits
        long viewCount6 = 3_123_456_789L; // "_" is used to make more readable

        float number = 10.3F;

        char letter = 'A';

        boolean isEligibleToVote = true;
        System.out.println(number);

    }
}
