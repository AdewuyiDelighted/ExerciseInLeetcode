import leetcodeSpecial.PhoneNumberLetterCombination;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberLetterCombinationTest {
    @Test
    public void testThatFunctionReturnLetterCombinationOfPhoneNumber(){
        String input = "23";
        String [] output ={"ad","ae","af","bd","be","bf","cd","ce","cf"};
        assertArrayEquals(output, PhoneNumberLetterCombination.possibleLetterCombination(input));
    }
    @Test
    public void testThatFunctionWhenTheGiveNumberIsOfLengthOne(){
        String input = "2";
        String [] output ={"a","b","c"};
        assertArrayEquals(output, PhoneNumberLetterCombination.possibleLetterCombination(input));
    }
    @Test
    public void testThatFunctionWhenTheGiveNumberIsOfLengthZero(){
        String input = "";
        assertNull(PhoneNumberLetterCombination.possibleLetterCombination(input));
    }
    @Test
    public void testThatFunctionWhenTheGiveNumberIsOfLengthIsGreaterThatFive(){
        String input = "34568";
        assertNull(PhoneNumberLetterCombination.possibleLetterCombination(input));

    }






}