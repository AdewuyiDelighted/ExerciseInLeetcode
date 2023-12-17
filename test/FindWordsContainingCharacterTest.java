import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FindWordsContainingCharacterTest {
    @Test
    public void givenAnArrayOfStringReturnTheIndexThatHasTheTargetChar(){

        String [] words = {"leet","code"};
        String target = "e";
        int [] expected = {0,1};
        assertArrayEquals(expected,FindWordsContainingCharacter.findWord(words,target));

    }
    @Test
    public void givenAnArrayOfStringReturnTheIndexThatHasTheTargetCharWhenThereIsElementThatDoesNotHaveTarget(){
        String [] words = {"abc","bcd","aaaa","cbc"};
        String target = "a";
        int [] expected = {0,2};
        assertArrayEquals(expected,FindWordsContainingCharacter.findWord(words,target));

    }
    @Test public void testWhenNoElementHasTheTargetInTheArray(){
        String [] words = {"abc","bcd","aaaa","cdb"};
        String target = "z";
        int [] expected = {};
        assertArrayEquals(expected,FindWordsContainingCharacter.findWord(words,target));
    }


}