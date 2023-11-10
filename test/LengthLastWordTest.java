import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthLastWordTest {
    @Test
    public void thatThatFunctionReturnTheLengthOfLastWord() {
        String words = "Hello World";
        int answer = 5;
        int result = LengthLastWord.findTheLastLength(words);
        assertEquals(answer, result);
    }

    @Test
    public void thatThatFunctionReturnTheLengthOfLastWordIfItALongerSentence() {
        String words = "luff is still joyboy";
        int answer = 6;
        int result = LengthLastWord.findTheLastLength(words);
        assertEquals(answer, result);
    }

    @Test
    public void thatThatFunctionReturnTheLengthOfLastWordEvenIfItIsNumbers() {
        String words = "My phone number is 09072034442";
        int answer = 11;
        int result = LengthLastWord.findTheLastLength(words);
        assertEquals(answer, result);
    }

    @Test
    public void thatThatFunctionReturnZeroIfTheLastWordIsSpaces() {
        String words = "Nigeria is a good     ";
        int answer = 0;
        int result = LengthLastWord.findTheLastLength(words);
        assertEquals(answer, result);
    }

    @Test
    public void testThatFunctionReturnTheLengthOFLastWordEvenIfThereSpacesInTheBeginningOfTheSentences() {
        String words = "    fly me to    the moon";
        int answer = 4;
        int result = LengthLastWord.findTheLastLength(words);
        assertEquals(answer, result);
    }

}