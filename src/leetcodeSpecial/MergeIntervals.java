package leetcodeSpecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
//        System.out.println((Arrays.deepToString(mergedIntervals(new int[][]{{6, 8}, {1, 9}, {2, 4}, {4, 7}}))));
//        System.out.println((Arrays.deepToString(mergedIntervals(new int[][]{{1,3},{2,6},{8,10},{15,18}}))));
        System.out.println((Arrays.deepToString(mergedIntervals(new int[][]{{1,4},{4,5}}))));

    }


    public static int[][] mergedIntervals(int[][] intervals) {
        int[][] sortedInterval = sortInterval(intervals);
        Stack<int[]> stack = convertToStack(sortedInterval);

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



