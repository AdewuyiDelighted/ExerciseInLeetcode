package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveNodeFromEndOfTheListTest {
    @Test
    public void testThatFunctionCanRemoveTheNNodeFromList() {
        LinkedList<Integer>  numbers = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
        int target = 2;
        LinkedList<Integer>  output  = new LinkedList<Integer>(Arrays.asList(1,2,3,5));
        assertEquals(output,RemoveNodeFromEndOfTheList.removeNode(numbers,target));
    }
    @Test
    public void testThatFunctionCanRemoveTheNNodeFromListWhenSizeIsTwo() {
        LinkedList<Integer>  numbers = new LinkedList<Integer>(Arrays.asList(1,2));
        int target = 1;
        LinkedList<Integer>  output  = new LinkedList<Integer>(Arrays.asList(1));
        assertEquals(output,RemoveNodeFromEndOfTheList.removeNode(numbers,target));
    }

}