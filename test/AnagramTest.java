import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test public void testThatFunctionReturnsTrueAnOutputIsAnagram(){
        String firstInput = "anagram";
        String secondInput = "nagaram";
        assertTrue(Anagram.isAnagram(firstInput,secondInput));
    }
    @Test public void testThatFunctionReturnsTrueAnOutputIsAnagramWhenThreeWord(){
        String firstInput = "cat";
        String secondInput = "tra";
        assertFalse(Anagram.isAnagram(firstInput,secondInput));
    }


}