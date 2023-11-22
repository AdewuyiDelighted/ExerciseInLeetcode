import java.util.Arrays;

public class RotateImage {
    static int[] arrayFirst;

    public static void main(String[] args) {
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
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
        int temp = 0;
        int [] [] anotherArray = new int [array.length][array[0].length];
        for(int indices = 0;indices < array[0].length;indices++){
            anotherArray[0]
        }

        for(int index = 0; index < array.length; index++) {
            int secondArrayFirstIndex = array.length - 1;
            for (int count = 0; count < array[index].length; count++) {
              //  array[index][array.length - 1] = firstArray[index];
                array[index][count] = array[secondArrayFirstIndex][index];
                secondArrayFirstIndex--;


                array[index][array.length - 1] = firstArray[index];
            }
        }
       // array[index][array.length -1] = firstArray[index];

        return array;
    }

    public static int[][] reverseColumn(int[][] array) {
        int counter = 0;
        for (int index = 0; index < array.length; index++) {
            for (int count = array[index].length; count > 0; count--) {
                int temp = array[counter][index];
                array[counter][index] = array[count - 1][index];
                array[count - 1][index] = temp;
                counter++;
            }
            counter = 0;
        }
        return array;
    }

}



