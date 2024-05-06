package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMisMatchTest {
    @Test
    public void testThatFunctionReturnTheMisplacedNumber(){
        int [] input = {1,2,2,4};
        int [] output = {2,3};
        assertArrayEquals(output,SetMisMatch.setMismatch(input));

    }
    @Test
    public void testThatFunctionReturnTheMisplacedNumberWhenTheArrayContainOneTwoElements(){
        int [] input = {1,1};
        int [] output = {1,2};
        assertArrayEquals(output,SetMisMatch.setMismatch(input));

    }

}