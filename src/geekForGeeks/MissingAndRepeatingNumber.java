package geekForGeeks;


public class MissingAndRepeatingNumber {
    public static int findMissingNumber(int[] array) {
        int missingNumber = 0;
        int count = 0;
        int[] sortedArray = Sort.ascending(array);
        for (int index = 0; index < sortedArray.length; index++) {
            int numberAfter = sortedArray[count] + 1;
            missingNumber = numberAfter;
            if (numberAfter != sortedArray[index]) {
                missingNumber = numberAfter;
            }
        }
        return missingNumber;
    }
}

