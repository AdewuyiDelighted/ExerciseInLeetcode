import java.util.Random;

public class Anagram {

    public static boolean isAnagram(String firstInput, String secondInput) {
        int counter = 0;
        if (firstInput.length() == secondInput.length()) {
            for (int index = 0; index < firstInput.length(); index++) {
                for (int count = 0; count < secondInput.length(); count++) {
                    if (firstInput.charAt(index) == secondInput.charAt(count)) {
//                        secondInput.replace(secondInput.charAt(count),'0');
//                        System.out.println(secondInput);
                        counter++; break;

                    }
                }
            }
            return counter == firstInput.length();

        } else return false;
    }
}
