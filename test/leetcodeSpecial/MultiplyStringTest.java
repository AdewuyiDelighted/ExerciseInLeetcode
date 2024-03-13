package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringTest {
    @Test public void testThatFunctionCanMultiplyString(){
        String firstWord = "2";
        String secondWord = "3";
        String answer = "6";
        assertEquals(answer,MultiplyString.multiplyString(firstWord,secondWord));

    }
    @Test public void testThatFunctionCanMultiplyStringWhenOneWordGreaterTwo(){
        String firstWord = "254";
        String secondWord = "54";
        String answer = "13716";
        assertEquals(answer,MultiplyString.multiplyString(firstWord,secondWord));

    }
    @Test public void testThatFunctionCanMultiplyStringTheTwoWordAreTwoLength(){
        String firstWord = "12";
        String secondWord = "10";
        String answer = "120";
        assertEquals(answer,MultiplyString.multiplyString(firstWord,secondWord));

    }


}