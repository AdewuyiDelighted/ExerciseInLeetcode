package leetcodeSpecial;

import java.util.ArrayList;

public class MinimumCommonValue {

    public static int minimumCommonValue(int[] inputOne, int[] inputTwo) {
        ArrayList<Integer> commonValue = new ArrayList<>();
        int length = Math.max(inputOne.length, inputTwo.length);
        int count = 0;
        for (int index = 0; index < length; index++) {
            if (count == inputTwo.length) break;
            if (inputOne[index] == inputTwo[count]) {
                commonValue.add(inputTwo[count]);
                if(index == length) count++;
            }
        }
        return returnMinimum(commonValue);
    }

    public static int returnMinimum(ArrayList<Integer> input) {
        int smallest = input.get(0);
        for (int index = 0; index < input.size(); index++) {
            if (input.get(index) < smallest) {
                smallest = input.get(index);
            }
        }
        return smallest;
    }


}
