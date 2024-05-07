package leetcodeSpecial;

import java.util.ArrayList;
import java.util.List;

public class PositionOfLargestGroup {
    public static List<List<Integer>> positionOfLargestGroup(String input) {
        int lastListEndIndex = 0;
        List<List<Integer>> indexOfLongestString = new ArrayList<>();
        for (int index = 0; index < input.length(); index++) {
            List<Integer> startToEndIndex = countString(input, input.charAt(index), index);
            if (!startToEndIndex.isEmpty()) {
                if (startToEndIndex.get(1) <= lastListEndIndex) continue;
                lastListEndIndex = startToEndIndex.get(1);
                indexOfLongestString.add(startToEndIndex);
            }
        }
        return indexOfLongestString;
    }

    private static List<Integer> countString(String input, char index, int indexNumber) {
        List<Integer> startToEnd = new ArrayList<>();
        int countLength = 0;
        int lastIndex = 0;
        for (int count = indexNumber + 1; count < input.length(); count++) {
            if (input.charAt(count) != index) break;
            if (input.charAt(count) == index) {
                countLength++;
                lastIndex = count;
            }
        }
        if (countLength >= 2) {
            startToEnd.add(indexNumber);
            startToEnd.add(lastIndex);
            return startToEnd;
        }
        return startToEnd;
    }
}
