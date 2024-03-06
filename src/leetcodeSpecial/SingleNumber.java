package leetcodeSpecial;

public class SingleNumber {
    public static int[] findTwoDistinctNumber(int[] array) {
        int[] distinctNumbers = new int[2];
        int counter = 0;
        int distinctCounter = 0;
        for (int index = 0; index < array.length; index++) {
            for (int count = 0; count < array.length; count++) {
                if (array[index] == array[count]) {
                    counter++;
                }
            }
            if (counter == 1) {
                distinctNumbers[distinctCounter] = array[index];
                distinctCounter++;
            }
            counter = 0;
        }
        return distinctNumbers;
    }
}
