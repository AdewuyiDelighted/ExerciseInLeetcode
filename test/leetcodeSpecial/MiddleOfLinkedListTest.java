package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfLinkedListTest {

    @Test
    public void testThatTheMiddleOfALinkedListIsReturned(){
        LinkedList<Integer> input = (LinkedList<Integer>) List.of(1,2,3,4,5);
        LinkedList<Integer> output = (LinkedList<Integer>) List.of(3,4,5);
        assertEquals(output,MiddleOfLinkedList.middleOfLinkedList(input));

    }

}