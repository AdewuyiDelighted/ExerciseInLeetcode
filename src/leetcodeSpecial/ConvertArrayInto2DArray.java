package leetcodeSpecial;

import java.util.ArrayList;
import java.util.Arrays;


public class ConvertArrayInto2DArray {


    public static int[][] convertArrayToTwoDArray(int[] input) {
        ArrayList<ArrayList<Integer>> nextedList = new ArrayList<>();
        ArrayList<Integer> inputList = convertArrayToAListInt(input);
        ArrayList<Integer> oneArray;
        int countZero = 0;
        while (countZero != input.length) {
            oneArray = new ArrayList<>();
            for (int index = 0; index < inputList.size(); index++) {
                if (inputList.get(index) == 0) continue;
                if (!oneArray.contains(inputList.get(index))) {
                    oneArray.add(inputList.get(index));
                    inputList.set(index, 0);
                    countZero++;
                }
            }
            nextedList.add(oneArray);
        }
        return convertNestedListToNestedArray(nextedList);
    }

    private static int[][] convertNestedListToNestedArray(ArrayList<ArrayList<Integer>> elements) {
        int [][] nestedArray = new int[elements.size()][];
        for(int index = 0;index < elements.size();index++){
            nestedArray[index] = convertListToArray(elements.get(index));
        }
        return nestedArray;

    }
    private static int[] convertListToArray(ArrayList<Integer> elements) {
        int[] array = new int[elements.size()];
        for (int index = 0; index < elements.size(); index++) {
            array[index] = elements.get(index);
        }
        return array;
    }

    private static ArrayList<Integer> convertArrayToAListInt(int[] inputs) {
        ArrayList<Integer>  convertInput = new ArrayList<>();
        for (int index = 0; index < inputs.length; index++) {
            convertInput.add(inputs[index]);
        }
        return convertInput;
    }
}
