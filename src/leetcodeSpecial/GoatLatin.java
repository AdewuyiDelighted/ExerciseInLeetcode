package leetcodeSpecial;

import java.util.Arrays;

public class GoatLatin {
    public static String goatLatin(String input) {
        String goatLatin = "";
        String suffix = "maa";
        String[] splitBySpace = input.split(" ");
        for (int index = 0; index < splitBySpace.length; index++) {
            String vowelCheck = vowelCheck(splitBySpace[index]);
            vowelCheck += suffix;
            goatLatin += vowelCheck + " ";
            suffix += suffix.charAt(suffix.length() - 1);
        }
        return goatLatin.trim();

    }

    private static String vowelCheck(String input) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int index = 0; index < vowels.length; index++) {
            if (input.charAt(0) == vowels[index]) {
                return input;
            }

        }
        StringBuilder inputStringBuilder = new StringBuilder(input);
        inputStringBuilder.append(input.charAt(0));
        inputStringBuilder.deleteCharAt(0);
        return String.valueOf(inputStringBuilder);
    }
}
