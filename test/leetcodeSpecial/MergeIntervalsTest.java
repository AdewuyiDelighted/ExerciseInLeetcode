package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test public void testThatFunctionsCanMergeIntervals(){
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [][] mergedIntervals = {{1,6},{8,10},{15,18}};
//        assertArrayEquals(mergedIntervals,MergeIntervals.mergedIntervals(intervals));

    }

}