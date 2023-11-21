import java.util.ArrayList;
import java.util.Arrays;

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
    public static int[] removeElement(int [] nums,int elementToRemove){
        // elementToRemove = -1;
        ArrayList<Integer> numberNotVal = new ArrayList<>();
         for(int index = 0; index < nums.length;index++){
             if(nums[index] != elementToRemove){
                 numberNotVal.add(nums[index]);
             }
         }
         return Convert.convertListToArray(numberNotVal);
    }
    public static int[] numberInPlace(int[] nums,int target){
       int count = countElementNotEqualToVal(nums,target);
       int [] array = arrayWithoutVal(nums,target);
       int [] newArray = removeElement(nums,-1);
        return newArray;
    }
}
