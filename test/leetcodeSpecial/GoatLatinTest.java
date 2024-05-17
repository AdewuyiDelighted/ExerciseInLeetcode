package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoatLatinTest {
    @Test
    public void testFunctionReturnTheGoatLatinOfGivenString(){
        String input = "I speak Goat Latin";
        String output = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
        assertEquals(output,GoatLatin.goatLatin(input));
    }
    @Test
    public void testFunctionReturnTheGoatLatinOfLongerGivenString(){
        String input = "The quick brown fox jumped over the lazy dog";
        String output = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
        assertEquals(output,GoatLatin.goatLatin(input));
    }

}