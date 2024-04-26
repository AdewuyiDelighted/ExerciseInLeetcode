package leetcodeSpecial;

public class MinimumCommonValue {

    public static int minimumCommonValue(int[] inputOne, int[] inputTwo) {
        int inputOneMini = returnTheMinimum(inputOne);
        for (int index = 0; index < inputTwo.length; index++) {
            if (inputTwo[index] == inputOneMini) {
                return inputTwo[index];
            }
        }
        return -1;
    }

    private static int returnTheMinimum(int[] input) {
        int smallest = input[0];
        for (int index = 0; index < input.length; index++) {
            if (input[index] < smallest) smallest = input[index];
        }
        return smallest;
    }

}
