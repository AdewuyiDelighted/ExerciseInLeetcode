import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    @Test
    public void testThatFunctionTakesInStringMathematicalExpressionAndReturnAnswer(){
        String expression = "3+2*2";
        String expected = "7";
        assertEquals(expected,BasicCalculator.calculateExpressionOf(expression));
    }

}