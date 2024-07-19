public class Lesson28 {
    public static void main(String[] args) {
        // For-Each Loop
        // 02:18:51

        String[] fruits = {"Apple", "Mango", "Orange"};

//        int i;
//        for (i = 0; i < fruits.length; i++){
//            System.out.println(fruits[i]);
//        }

        // We declared an array counter to start in "0" and while this counter
        // is less than the length of "fruits.length", then increment this
        // counter.

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        // The code above means that "fruit" (or another word that you want to
        // use) is inside "fruits", then just call it and going to show you
        // what is inside.
    }
}