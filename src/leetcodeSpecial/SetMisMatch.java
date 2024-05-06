package leetcodeSpecial;

import java.util.Arrays;

public class SetMisMatch {

    public static int[] setMismatch(int[] input) {
        int[] misMatchNumber = new int[2];
        for (int index = 0; index < input.length; index++) {
            if (checkDuplicate(input, index)) {
                misMatchNumber[0] = input[index];
                misMatchNumber[1] = input[index] + 1;
            }
        }
        return misMatchNumber;
    }

    private static boolean checkDuplicate(int[] input, int numberIndex) {
        for (int index = numberIndex + 1; index < input.length; index++) {
            if (input[index] == input[numberIndex]) return true;
        }
        return false;
    }
}
