package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductOfLengthTest {
    @Test public void  testThatFunctionCanReturnsLengthOfTwoUnlikeWord(){
       String[] input = {"abcw","baz","foo","bar","xtfn","abcdef"};
       int output = 16;
       assertEquals(output,MaximumProductOfLength.maximumProductOfTheLength(input));
    }
}