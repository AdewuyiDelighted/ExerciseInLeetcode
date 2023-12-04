import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzbuzz(5));
    }

    public static ArrayList<String> fizzbuzz(int number) {
        String letters = "";
        ArrayList<String> input = new ArrayList<>();
        for (int index = 1; index <= number; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                letters = "FizzBuzz";
            } else if (index % 3 == 0) {
                letters = "Fizz";
            } else if (index % 5 == 0) {
                letters = "Buzz";


            } else {
                letters = String.valueOf(index);

            }
            input.add(letters);
        }
        return input;

    }
}