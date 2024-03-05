package leetcodeSpecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneNumberLetterCombination {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(possibleLetterCombination("56790")));
    }

    public static String[] possibleLetterCombination(String input) {
        ArrayList<String> letterCombination = new ArrayList<>();
        ArrayList<String> letters = null;

        int length = 0;
        HashMap<String, String> numbersLetters = new HashMap<>();
        numbersLetters.put("2", "abc");
        numbersLetters.put("3", "def");
        numbersLetters.put("4", "ghi");
        numbersLetters.put("5", "jkl");
        numbersLetters.put("6", "mno");
        numbersLetters.put("7", "pqrs");
        numbersLetters.put("8", "tuv");
        numbersLetters.put("9", "wxyz");

        for (int index = 0; index < input.length(); index++) {
            String number = String.valueOf(input.charAt(index));
            String letter = numbersLetters.get(number);
            letterCombination.add(letter);
        }

        if (input.length() > 1 && input.length() < 5) {
            letters = moreThanOneNumbers(letterCombination);
        } else if(input.length() == 1) {
            letters = oneNumber(letterCombination);
        }else{
            return null;
        }

        return Convert.convertListToArrayString(letters);

    }

    private static ArrayList<String> oneNumber(ArrayList<String> letterCombination) {
        ArrayList<String> letters = new ArrayList<>();
        for (int index = 0; index < letterCombination.get(0).length(); index++) {
            letters.add(String.valueOf(letterCombination.get(0).charAt(index)));

        }
        return letters;
    }

    private static ArrayList<String> moreThanOneNumbers(ArrayList<String> letterCombination) {
        ArrayList<String> letters = new ArrayList<>();
        int counter = 1;
        String combo = "";
        while (counter != letterCombination.size()) {
            for (int index = 0; index < letterCombination.get(0).length(); index++) {
                for (int count = 0; count < letterCombination.get(counter).length(); count++) {
                    combo = String.valueOf(letterCombination.get(0).charAt(index));
                    combo += String.valueOf(letterCombination.get(counter).charAt(count));
                    letters.add(combo);
                }
            }
            counter++;
        }
        return letters;
    }
}
