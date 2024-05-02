package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindPlayerWithZeroOrNoLossesTest {
    @Test
    public void testNumberOfWinnersAndOneTimeLoser() {
        int[][] input = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        List<List<Integer>> output = List.of(List.of(1, 2,10), List.of(4,5,7,8));
        assertEquals(output,FindPlayerWithZeroOrNoLosses.findPlayerWithZeroOrNoLosses(input));
    }
    @Test
    public void testNumberOfWinnersAndOneTimeLoserWhenThereIsNoOneTimeLoser() {
        int[][] input = {{2,3},{1,3},{5,4},{6,4}};
        List<List<Integer>> output = List.of(List.of(1, 2,5,6), List.of());
        assertEquals(output,FindPlayerWithZeroOrNoLosses.findPlayerWithZeroOrNoLosses(input));
    }

}