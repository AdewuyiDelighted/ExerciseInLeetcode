package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PositionOfLargestGroupTest {
    @Test public void testThatFunctionReturnTheIndexOfTheLargestGroup(){
        String input = "abbxxxxzzy";
        List<List<Integer>> index = List.of(List.of(3,6));
        assertEquals(index,PositionOfLargestGroup.positionOfLargestGroup(input));
    }
    @Test public void testThatFunctionReturnTheIndexOfTheLargestGroupWhenThereIsJustOneLetter(){
        String input = "abc";
        List<List<Integer>> index = List.of();
        assertEquals(index,PositionOfLargestGroup.positionOfLargestGroup(input));
    }
    @Test public void testThatFunctionReturnTheIndexOfTheLargestGroupWhenThereIsLongString(){
        String input = "abcdddeeeeaabbbcd";
        List<List<Integer>> index = List.of(List.of(3,5),List.of(6,9),List.of(12,14));
        assertEquals(index,PositionOfLargestGroup.positionOfLargestGroup(input));
    }

}