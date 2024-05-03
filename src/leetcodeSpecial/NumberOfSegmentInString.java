package leetcodeSpecial;

import java.util.Arrays;

public class NumberOfSegmentInString {

    public static int segmentOfString(String input) {
        String[] word = input.split(" ");
        return word.length;
    }
}
