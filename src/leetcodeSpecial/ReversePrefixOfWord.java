package leetcodeSpecial;

import org.jetbrains.annotations.NotNull;

public class ReversePrefixOfWord {
    public static String reversePrefix(String input, char ch) {
        String prefix = "";
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == ch) {
                prefix = input.substring(0, index);
                return getString(input, prefix, ch, index);
            }
        }
        return input;
    }

    @NotNull
    private static String getString(String input, String prefix, char ch, int index) {
        String newWord = "";
        newWord += ch;
        for (int count = prefix.length() - 1; count >= 0; count--) {
            newWord += prefix.charAt(count);
        }
        newWord += input.substring(index + 1);
        return newWord;
    }
}
