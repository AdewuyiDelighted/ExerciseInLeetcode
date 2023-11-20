import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfSubarrayTest {
    @Test
    public void testThatFunctionReturnTheLengthOfOfTheLongestSubArray(){
        int [] numbers = {3,2,5,4};
        int answer = 3;
        assertEquals(answer, LengthSubarray.longestSubarray(numbers));
    }
    @Test
    public void testIfTheStartOfSubarrayIsNotFound(){
        int [] numbers = {15,19,13,17,21};
        int answer = 0;
        assertEquals(answer, LengthSubarray.longestSubarray(numbers));
    }
    @Test
    public void testIfSomeElementInTheArrayNegativeValue(){
        int [] numbers = {-9,-7,8,-6,2,11,19,67};
        int answer = 6;
        assertEquals(answer, LengthSubarray.longestSubarray(numbers));
    }
    @Test
    public void testIfTheStartOfSubarrayIsNegativeElement(){
        int [] numbers = {-9,7,-8,-6,2,11,19,67,4};
        int answer = 7;
        assertEquals(answer, LengthSubarray.longestSubarray(numbers));
    }




}
