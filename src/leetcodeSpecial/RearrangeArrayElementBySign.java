package leetcodeSpecial;

import java.util.Arrays;

public class RearrangeArrayElementBySign {


    public static int[] rearrangeArrayElementBySign(int[] input) {
        int[] inputGreaterThanZero = inputGreaterThanZero(input);
        int[] inputLesserThanZero = inputLessThanZero(input);
        int count = 0;
        for (int index = 0; index < input.length; index += 2) {
            input[index] = inputGreaterThanZero[count];
            input[index + 1] = inputLesserThanZero[count];
            count++;
        }
        return input;
    }


    private static int[] inputLessThanZero(int[] input) {
        int[] newArray = new int[input.length / 2];
        int count = 0;
        for (int index = 0; index < input.length; index++) {
            if (input[index] < 0) {
                newArray[count] = input[index];
                count++;
            }
        }
        return newArray;
    }

    private static int[] inputGreaterThanZero(int[] input) {
        int[] newArray = new int[input.length / 2];
        int count = 0;
        for (int index = 0; index < input.length; index++) {
            if (input[index] > 0) {
                newArray[count] = input[index];
                count++;
            }
        }
        return newArray;
    }

}
