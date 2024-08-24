package DailyExerciseNew;

import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] results = {"Mary", "Emma", "John"};
        System.out.println(Arrays.toString(sortThePeople(names, heights)));
    }

    public static String[] sortThePeople(String[] names, int[] heights) {
        String temps;
        int temp = 0;
//        int[] heights = {180, 165, 170};

        for (int height = 0; height < heights.length; height++) {
            for (int index = 0; index < heights.length; index++) {
                if (heights[height] > heights[index]) {
                    temps = names[height];
                    temp = heights[height];
                    names[height] = names[index];
                    names[index] = temps;
                    heights[height] = heights[index];
                    heights[index] = temp;
                }
            }
        }


        return names;
    }
}
