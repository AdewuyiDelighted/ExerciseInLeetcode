package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumGapTest {

    @Test public void testThatTheMaximumGapOfTheWouldBeReturned(){
        int [] nums = {3,6,9,1};
        int output = 3;
        assertEquals(output,MaximumGap.getMaxGap(nums));
    }

    @Test public void testThatTheMaximumGapWhenTheLengthOfArrayIsBelow2(){
        int [] nums = {10};
        int output = 0;
        assertEquals(output,MaximumGap.getMaxGap(nums));
    }
    @Test public void testThatTheMaximumGapOfWithAnotherArray(){
        int [] nums = {4,8,0,2,1};
        int output = 4;
        assertEquals(output,MaximumGap.getMaxGap(nums));
    }

    @Test public void testThatTheMaximumGapWhenArrayIslonger(){
        int [] nums = {1,5,6,3,6,7,19};
        int output = 12;
        assertEquals(output,MaximumGap.getMaxGap(nums));
    }





}