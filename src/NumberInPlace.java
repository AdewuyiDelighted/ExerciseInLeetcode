import java.util.ArrayList;

public class NumberInPlace {

    public static int countElementNotEqualToVal(int[] nums, int target) {
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != target) {
                count++;
            }
        }
        return count;
    }

    public static int[] arrayWithoutVal(int[] nums, int val) {
        int[] newArray = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == val) {
                nums[index] = -1;
            }
        }
        return nums;

    }
    public static int[] arrayWithLengthCount(int [] nums, int target){
        nums = arrayWithoutVal(nums,target);
        ArrayList<Integer> numberNotVal = new ArrayList<>();
         for(int index = 0; index < nums.length;index++){
             if(nums[index] != -1){
                 numberNotVal.add(nums[index]);
             }
         }
         return Convert.convertListToArray(numberNotVal);
    }
}
