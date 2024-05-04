package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackSpaceStringCompareTest {
    @Test public void testTheBackSpace(){
        String firstInput = "ab#c";
        String secondInput = "ad#c";
        assertTrue(BackSpaceStringCompare.backSpaceStringCompare(firstInput, secondInput));


    }
    @Test public void testTheBackSpaceWhenTheResultIsTrue(){
        String firstInput = "ab##";
        String secondInput ="c#d#";
        assertTrue(BackSpaceStringCompare.backSpaceStringCompare(firstInput, secondInput));


    }
    @Test public void testTheBackSpaceWhenTheResultIsFalse(){
        String firstInput = "a#c";
        String secondInput ="b";
        assertFalse(BackSpaceStringCompare.backSpaceStringCompare(firstInput, secondInput));


    }

}