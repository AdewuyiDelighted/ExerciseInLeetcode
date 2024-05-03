package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSegmentInStringTest {
    @Test public void testThatFunctionReturnsTheSegmentOfString(){
        String input = "Hello, my name is John";
        int output = 5;
        assertEquals(output,NumberOfSegmentInString.segmentOfString(input));
    }

}