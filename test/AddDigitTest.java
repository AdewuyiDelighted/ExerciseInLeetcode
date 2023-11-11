import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitTest {
    @Test
    public void testFunctionReturnTenTimesTheLengthOfInput(){
        int number = 32;
        int answer = 10;
        int result = AddDigit.tenTimesLength(number);
        assertEquals(answer,result);
    }
    @Test
    public void testThatFunctionReturnOneDigitAfterItHasSumUpAllInputDigits(){
        int number = 38;
        int answer = 2;
        int result = AddDigit.addDigit(number);
        assertEquals(answer,result);

        }
    @Test
    public void testThatFunctionReturnOneDigitAfterItHasSumUpAllInputDigitEvenIfTheInputLengthIsMoreThanTen(){
        int number = 388;
        int answer = 1;
        int result = AddDigit.addDigit(number);
        assertEquals(answer,result);

    }


}

