package leetcodeSpecial;


import java.util.LinkedList;


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
