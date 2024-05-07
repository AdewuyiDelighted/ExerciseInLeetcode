package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionToRecurringDecimalTest {
    @Test
    public void testThatFunctionReturnsTheRecurringDecimalOfInput(){
        int numerator = 1;
        int denominator = 2;
        assertEquals("0.5",FractionToRecurringDecimal.fractionToRecurringDecimal(numerator,denominator));

    }

}