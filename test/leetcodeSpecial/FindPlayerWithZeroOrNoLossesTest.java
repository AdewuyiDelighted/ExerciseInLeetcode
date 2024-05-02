package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPlayerWithZeroOrNoLossesTest {
    @Test
    public void testNumberOfWinnersAndOneTimeLoser() {
        int[][] input = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        int[][] output = {{1, 2, 10}, {4, 5, 7, 8}};
//        assertArrayEquals(output,FindPlayerWithZeroOrNoLosses.findPlayerWithZeroOrNoLosses(input));
    }

}