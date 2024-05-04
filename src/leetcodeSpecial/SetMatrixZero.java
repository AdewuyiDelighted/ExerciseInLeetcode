package leetcodeSpecial;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {


    public static int[][] setMatrixZero(int[][] input) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> colum = new HashSet<>();
        int count = 0;
        while (count != input.length) {
            for (int index = 0; index < input[0].length; index++) {
                if (input[count][index] == 0) {
                    rows.add(count);
                    colum.add(index);
                }
            }
            count++;
        }
        setColum(input, colum);
        setRow(input, rows);
        return input;
    }

    private static void setRow(int[][] input, Set<Integer> rowNumber) {

        for (int row : rowNumber) {
            for (int index = 0; index < input[0].length; index++) {
                input[row][index] = 0;

            }
        }
    }

    private static void setColum(int[][] input, Set<Integer> rowNumber) {

        for (int row : rowNumber) {
            for (int index = 0; index < input.length; index++) {
                input[index][row] = 0;

            }
        }
    }


}
