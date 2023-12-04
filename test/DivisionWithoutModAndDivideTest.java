import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionWithoutModAndDivideTest {
    @Test
    public void testThatFunctionCanDivideWithUsingModSign(){
        int dividend = 10;
        int divisor = 3;
        int answer = 3;
        assertEquals(answer,DivisionWithoutModAndDivide.divideTwoIntegers(dividend,divisor));
    }
    @Test
    public void testThatFunctionCanDivideWithUsingModSignWhenDivisorIsNegativeValue(){
        int dividend = 7;
        int divisor = -3;
        int answer = -2;
        assertEquals(answer,DivisionWithoutModAndDivide.divideTwoIntegers(dividend,divisor));
    }



}