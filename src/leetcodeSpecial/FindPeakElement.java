package leetcodeSpecial;

public class FindPeakElement {
    public static int findPeak(int[] num) {
        if(num.length > 1) {
            for (int index = 0; index < num.length; index++) {
                if (isPeak(num, index)) return index;
            }
        }if (num.length == 1)return 0;
        return -1;
    }

    private static boolean isPeak(int[] array, int index) {
        if (index == 0) {
            return array[index] > array[index + 1];
        } else if (index == array.length - 1) {
            return array[index] > array[index - 1];
        } else {
            return array[index] > array[index - 1] && array[index] > array[index + 1];

        }
    }

}

