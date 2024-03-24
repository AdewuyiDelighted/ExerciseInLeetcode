package leetcodeSpecial;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
//        System.out.println((Arrays.deepToString(mergedIntervals(new int[][]{{6, 8}, {1, 9}, {2, 4}, {4, 7}}))));
        System.out.println((Arrays.deepToString(mergedIntervals(new int[][]{{1,3},{2,6},{8,10},{15,18}}))));

    }

    public static int[][] mergedIntervals(int[][] intervals) {
        ArrayList<int[]> merged = new ArrayList<>();
        int[][] sortedInterval = sortInterval(intervals);
        for (int index = 0; index < sortedInterval.length -1; index++) {
            int firstValue = intervals[index+1][1];
            int secondValue = intervals[index][1];
            int thirdValue = intervals[index][0];
            if(firstValue > thirdValue && firstValue <= secondValue){
                sortedInterval[index][1] = sortedInterval[index+1][1];
                merged.add(sortedInterval[index]);

            }else {
                merged.add(intervals[index]);
            }
        }

        return convertToArray(merged);

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
    private static int[][] convertToArray(ArrayList<int[]> interval){
        int [][] invervalArray = new int[interval.size()][2];
        for(int index = 0;index < interval.size();index++){
            invervalArray[index] = interval.get(index);
        }
        return invervalArray;
    }
}



