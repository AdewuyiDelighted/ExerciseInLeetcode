package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {
    @Test
    public void testThatFunctionGetPeak(){
        int [] num = {1,2,3,1};
        int output = 2;
        assertEquals(output,FindPeakElement.findPeak(num));
    }
    @Test public void testThatFunctionGetPeakWhenArrayHasMoreElement(){
        int[] nums = {1,2,1,3,5,6,4};
        int output = 1;
        assertEquals(output,FindPeakElement.findPeak(nums));
    }
    @Test public void testThatFunctionGetPeakWhenArrayHasOneElement(){
        int[] nums = {3};
        int output = 0;
        assertEquals(output,FindPeakElement.findPeak(nums));
    }
    @Test public void testThatFunctionGetPeakWhenArrayIsEmpty(){
        int[] nums = {};
        int output = -1;
        assertEquals(output,FindPeakElement.findPeak(nums));
    }
    @Test public void testThatGetPeakWhenPeakIsAtTheExtremeEnd(){
        int[] nums = {1,1,2,3,4};
        int output = 4;
        assertEquals(output,FindPeakElement.findPeak(nums));
    }



}