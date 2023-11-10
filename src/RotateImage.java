import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(rotateAll(array)));
    }

    public static boolean checkLengthOfArray() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int counter = 0;
        int count = 0;
        int lengthOne = array[0].length;
        for (int index = 0; index < array.length; index++) {
            if (array[count].length == lengthOne) counter++;
            {
                count++;
            }
        }
        return counter == array.length;
    }

    public static int[][] rotateAll(int[][] array) {
        int[] arrayFirst = array[0];
        for (int index = 0; index < array.length; index++) {
            int secondArrayFirstIndex = array.length - 1;
            for (int count = 0; count < array[index].length - 1; count++) {
                array[index][count] = array[secondArrayFirstIndex][index];
                secondArrayFirstIndex--;
            }
            array[index][array.length - 1] = arrayFirst[index];

        }
        return array;
    }

    public static int[][] reverseColumn(int[][] array) {
        for (int index = 0; index < array.length; index++) {
            for (int count = array[index].length; count > 0; count--) {

            }
        }

        return null;
    }
}



