package leetcodeSpecial;

import java.util.LinkedList;
import java.util.List;

import static java.util.List.of;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> input = (LinkedList<Integer>) List.of(1,2,3,4,5);
        System.out.println(middleOfLinkedList(input));
    }

    public static LinkedList<Integer> middleOfLinkedList(LinkedList<Integer> output) {
        int midOfLinkedList = output.size();
        System.out.println(midOfLinkedList);
//        for(int index = 0;index < output.size();index++){
//
//        }
        return null;
    }
}
