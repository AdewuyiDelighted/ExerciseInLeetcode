public class LengthSubarray {

    public static int longestSubarray(int[] numbers) {
        int subArrayStart = 0;
        int lengthCounter = 0;
        for (int index = 0;index < numbers.length;index++) {
            if (numbers[index] % 2 == 0) {
                subArrayStart = index + 1;
                break;
            }
        }
        if(subArrayStart == 0){
            return 0;

        }
        for (int subarray = subArrayStart -1; subarray < numbers.length;subarray++){
            lengthCounter ++;
        }

        return lengthCounter;
    }
}
;