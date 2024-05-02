package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixOfWordTest {
    @Test
    public void testFunctionReturnsThePrefixOfTheGivenString(){
        String input = "abcdefd";
        char ch = 'd';
        assertEquals("dcbaefd",ReversePrefixOfWord.reversePrefix(input,ch));
    }
@Test
    public void testFunctionReturnsThePrefixOfTheGivenStringWhenThereAnotherTestCase(){
        String input = "xyxzxe";
        char ch = 'z';
        assertEquals("zxyxxe",ReversePrefixOfWord.reversePrefix(input,ch));
    }
    @Test
    public void testFunctionReturnsThePrefixOfTheGivenStringWhenThereNoChInTheString(){
        String input = "abcd";
        char ch = 'z';
        assertEquals("abcd",ReversePrefixOfWord.reversePrefix(input,ch));
    }

}