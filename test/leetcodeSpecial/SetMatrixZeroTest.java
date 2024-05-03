package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroTest {
    @Test
    public void testThatWhenZeroIsFoundInTheTwoDArrayTheRowsAndColumnsBecomeZero() {
        int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] output = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        assertArrayEquals(output, SetMatrixZero.setMatrixZero(input));
    }

    @Test
    public void testThatWhenZeroIsFoundInTheTwoDArrayTheRowsAndColumnsBecomeZeroWhenTheRowLengthIsNotEqualToColumnLength() {
        int[][] input = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] output = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};

        assertArrayEquals(output, SetMatrixZero.setMatrixZero(input));
    }

    @Test
    public void testThatWhenZeroIsFoundInTheTwoDArrayTheRowsAndColumnsBecomeZeroWhenThereIsOnlyOneRow() {
        int[][] input = {{0, 1}};
        int[][] output = {{0, 0}};

        assertArrayEquals(output, SetMatrixZero.setMatrixZero(input));
    }

}