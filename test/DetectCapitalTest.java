import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {
    @Test
    public void testThatFunctionReturnTrueWhenWordAreInUpperCase(){
        String word = "USA";
        boolean checkWord = DetectCapital.detectCapital(word);
        assertTrue(checkWord);
    }
    @Test public void returnFalseIfUsageOfCapitalsIsNotCorrectInWordTest(){
        String word = "FlaG";
        boolean checkWord = DetectCapital.detectCapital(word);
        assertFalse(checkWord);
    }
    @Test public void returnTrueIfUsageOfCapitalsIsCorrectInWordTest(){
        String word = "Church";
        boolean checkWord = DetectCapital.detectCapital(word);
        assertTrue(checkWord);
    }
    @Test public void returnTrueIfIntegerAreEnteredTest(){
        String word = "080563";
        boolean checkWord = DetectCapital.detectCapital(word);
        assertTrue(checkWord);
    }
    @Test public void returnFalseIfThereIsTwoCapitalLetterInWords(){
        String word = "SemiColon";
        boolean checkWord = DetectCapital.detectCapital(word);
        assertFalse(checkWord);
    }







}