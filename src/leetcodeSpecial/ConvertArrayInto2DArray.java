package leetcodeSpecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ConvertArrayInto2DArray {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(convertArrayToTwoDArray(new int[]{1, 3, 4, 1, 2, 3, 1})));
    }

    public static int[][] convertArrayToTwoDArray(int[] input) {
        ArrayList<ArrayList<Integer>> nextedList = new ArrayList<>();
        ArrayList<Integer> inputList = Convert.convertArrayToAListInt(input);
        ArrayList<Integer> oneArray = new ArrayList<>();
        int countZero = 0;
        while (countZero != input.length){
        for (int index = 0; index < inputList.size(); index++) {
            if(inputList.get(index) == 0)continue;
            if (!oneArray.contains(inputList.get(index))) {
                oneArray.add(inputList.get(index));
                inputList.add(index, 0);
                countZero++;
            }
        }
        nextedList.add(oneArray);
        oneArray.clear();
        }
        return convertListToArray(nextedList);
    }

    public static int[][] convertListToArray(ArrayList<ArrayList<Integer>> elements) {
       return (int[][]) elements.stream()
                .flatMap(Collection::stream)
                .toArray();

    }

    private static ArrayList<Integer> breakIntoArray(ArrayList<Integer> input, ArrayList<Integer> oneArray) {
        for (int index = 0; index < input.size(); index++) {
            if (!oneArray.contains(input.get(index))) {
                oneArray.add(input.get(index));
                input.add(index, 0);

            }
        }
        return oneArray;
    }
}
