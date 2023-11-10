public class InsertPosition {
    public  static int[] sortArrayFirst(int...numbers){
        return Sort.ascending(numbers);

    }
    public static int findPosition(int target,int...numbers){
        int [] sortedNumbers = sortArrayFirst(numbers);
        int holdIndex = 0;
        for(int index = 0;index < sortedNumbers.length;index++) {
            if (sortedNumbers[index] == target) {
                holdIndex = index;break;
            } else if (sortedNumbers[index] > target) {
                holdIndex = index;break;

            } else if (sortedNumbers[index] != target){
                holdIndex = sortedNumbers.length;
            }
        }
        return holdIndex;
    }

}
