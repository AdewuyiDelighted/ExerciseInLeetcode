package leetcodeSpecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveNodeFromEndOfTheList {

    public static LinkedList<Integer> removeNode(LinkedList<Integer> numbers,int target) {
        if (!numbers.isEmpty()) {
            int nodeToRemove = numbers.size() - target;
            numbers.remove(nodeToRemove);
            return numbers;
        }
        return numbers;
    }

}
