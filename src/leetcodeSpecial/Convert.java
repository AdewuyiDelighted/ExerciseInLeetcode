package leetcodeSpecial;

import java.util.ArrayList;

public class Convert {
    public static int[] convertListToArray(ArrayList<Integer> elements) {
        int[] array = new int[elements.size()];
        for (int index = 0; index < elements.size(); index++) {
            array[index] = elements.get(index);
        }
        return array;
    }
    public static String[] convertListToArrayString(ArrayList<String> elements) {
        String[] array = new String[elements.size()];
        for (int index = 0; index < elements.size(); index++) {
            array[index] = elements.get(index);
        }
        return array;
    }
    public static ArrayList<Integer> convertArrayToAListInt(int[] inputs) {
        ArrayList<Integer>  convertInput = new ArrayList<>();
        for (int index = 0; index < inputs.length; index++) {
            convertInput.add(inputs[index]);
        }
        return convertInput;
    }



}
