package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RearrangeArrayElementBySignTest {
    @Test
    public void testFunctionRearrangeArrayAccordingToSign(){
    int [] input = {3,1,-2,-5,2,-4};
    int [] output = {3,-2,1,-5,2,-4};
    assertArrayEquals(output,RearrangeArrayElementBySign.rearrangeArrayElementBySign(input));
    }
    @Test
    public void testFunctionRearrangeArrayAccordingToSignWhenInputIsShorter(){
    int [] input = {-1,1};
    int [] output = {1,-1};
    assertArrayEquals(output,RearrangeArrayElementBySign.rearrangeArrayElementBySign(input));
    }

}