package leetcodeSpecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MergeIntervals {


    public static int[][] mergedIntervals(int[][] intervals) {
        Stack<int[]> stack = convertToStack(sortInterval(intervals));

        for (int index = 0; index < stack.size()-1; index++) {
            if (stack.get(index + 1)[0] >  stack.get(index)[0] && stack.get(index + 1)[0] <= stack.get(index)[1]) {
                if (stack.get(index + 1)[1] >= stack.get(index)[1]) {
                    stack.get(index)[1] = stack.get(index + 1)[1];
                }
                stack.set(index, stack.get(index));
                stack.remove(index + 1);
                index = -1;
            }
        }

        return convertToArray(stack);
    }

    private static int[][] sortInterval(int[][] intervals) {
        for (int index = 0; index < intervals.length - 1; index++) {
            if (intervals[index + 1][0] < intervals[index][0]) {
                int[] temp = intervals[index];
                intervals[index] = intervals[index + 1];
                intervals[index + 1] = temp;
            }
        }
        return intervals;
    }

    static int[][] convertToArray(Stack<int[]> interval) {
        int[][] invervalArray = new int[interval.size()][2];
        for (int index = 0; index < interval.size(); index++) {
            invervalArray[index] = interval.get(index);
        }
        return invervalArray;
    }

    public static Stack<int[]> convertToStack(int [][] sortedInterval) {
        Stack<int[]> stack = new Stack<>();
        stack.addAll(Arrays.asList(sortedInterval));
        return stack;
    }
}



