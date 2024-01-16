import org.jetbrains.annotations.TestOnly;

import java.util.Arrays;

public class ValidSudoku {
    public static void main(String[] args) {
        String[][] input = {{"5", "3", ".", ".", "7", ".", ".", "."}, {"6", ".", ".", "1", "9", "5", ".", ".", "."}, {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"}, {"4", ".", ".", "8", ".", "3", ".", ".", "1"}, {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."}, {".", ".", ".", "4", "1", "9", ".", "6", "."}};
        checkSquare3by3(input);
    }


    public static boolean isValidBoard(String[][] input) {
        return false;
    }

    private static boolean checkSquare3by3(String[][] board) {
        int indexCount = 0;
        int row = 0;
        int column = 0;

        String[][] threeByThreeBoard = new String[3][3];
        while (indexCount < 3) {
            for (int index = 0; index < threeByThreeBoard.length; index++) {
                for (int count = 0; count < board[index].length; count++) {
                    threeByThreeBoard[index][count] = board[row][column];
                    column++;
                    if (column > 2) {
                        column = 0;
                        row++;
                        indexCount++;
                    }


                }
            }
            System.out.println(Arrays.deepToString(threeByThreeBoard));
        }
        return false;
    }
}
