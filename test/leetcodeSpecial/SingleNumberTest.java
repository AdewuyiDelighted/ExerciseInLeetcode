package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    @Test
    public void testThatFunctionReturnsTheTwoDisctintNumber() {
    int[] array = {1,2,1,3,2,5};
    int [] output = {3,5};
    assertArrayEquals(output,SingleNumber.findTwoDistinctNumber(array));
    }
    @Test
    public void testThatFunctionReturnsTheTwoDisctintNumberWhenThereAreOnlyTwoElementWithOneNegative() {
        int[] array = {-1,0};
        int [] output = {-1,0};
        assertArrayEquals(output,SingleNumber.findTwoDistinctNumber(array));
    }
    @Test
    public void testThatFunctionReturnsTheTwoDisctintNumberWhenThereAreOnlyTwoElementWithOne() {
        int[] array = {1,0};
        int [] output = {1,0};
        assertArrayEquals(output,SingleNumber.findTwoDistinctNumber(array));
    }

}

