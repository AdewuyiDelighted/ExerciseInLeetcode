package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {
    @Test public void testThatFunctionReturnTheMinimumValueInAGivenTwoArray(){
        int [] inputOne = {1,2,3};
        int [] inputTwo = {2,4};
        assertEquals(2,MinimumCommonValue.minimumCommonValue(inputOne,inputTwo));
    }
    @Test public void testThatFunctionReturnTheMinimumValueInAGivenTwoArrayAreTheSameLength(){
        int [] inputOne = {1,2,3,6};
        int [] inputTwo = {2,3,4,5};
        assertEquals(2,MinimumCommonValue.minimumCommonValue(inputOne,inputTwo));
    }

}