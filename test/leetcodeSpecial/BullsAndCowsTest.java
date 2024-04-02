package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BullsAndCowsTest {
    @Test public void testTheBullsAndCowsInTheGivenSecretAndGuess(){
        String secret = "1807";
        String guess = "7810";
        String expected = "1A3B";
        assertEquals(expected,BullsAndCows.getHint(secret,guess));
    }
    @Test public void testTheBullsAndCowsInTheGivenSecretAndGuessWhenThereIsOnlyOneBullAndOneCow(){
        String secret = "1123";
        String guess = "0111";
        String expected = "1A1B";
        assertEquals(expected,BullsAndCows.getHint(secret,guess));
    }


}