package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test public void testThatFunctionsCanMergeIntervals(){
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [][] mergedIntervals = {{1,6},{8,10},{15,18}};
        assertArrayEquals(mergedIntervals,MergeIntervals.mergedIntervals(intervals));

    }
    @Test public void testThatFunctionsCanMergeIntervalsWhenMergeIntervalWouldResultToOne(){
        int [][] intervals = {{6, 8}, {1, 9}, {2, 4}, {4, 7}};
        int [][] mergedIntervals = {{1,9}};
        assertArrayEquals(mergedIntervals,MergeIntervals.mergedIntervals(intervals));

    }
    @Test public void testThatFunctionsCanMergeShorterIntervals(){
        int [][] intervals = {{1,4},{4,5}};
        int [][] mergedIntervals = {{1,5}};
        assertArrayEquals(mergedIntervals,MergeIntervals.mergedIntervals(intervals));

    }

}