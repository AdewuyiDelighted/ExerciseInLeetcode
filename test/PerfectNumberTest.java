import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {
    @Test public void testWhenTheDivisorsOfTargetIsAddedAndSumIsEqualToTarget(){
        int number = 28;
        boolean answer = PerfectNumber.isPerfectNumber(number);
        assertTrue(answer);
    }
    @Test public void testWhenTheDivisorsOfTargetIsAddedAndSumIsNotEqualToTarget(){
        int number = 7;
        boolean answer = PerfectNumber.isPerfectNumber(number);
        assertFalse(answer);
    }
    @Test public void testWhenTargetIsNegativeValue(){
        int number = -6;
        boolean answer = PerfectNumber.isPerfectNumber(number);
        assertFalse(answer);
    }


}