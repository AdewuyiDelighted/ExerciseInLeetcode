package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortCharacterByFrequencyTest {
    @Test public void testThatFunctionCanSortFrequencyByCharacter(){
        String word = "tree";
        String output = "eert";
        assertEquals(output,SortCharacterByFrequency.sortFrequency(word));
    }

}