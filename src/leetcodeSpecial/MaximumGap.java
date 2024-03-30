package leetcodeSpecial;

public class MaximumGap {

    public static int getMaxGap(int[] nums) {
        if(nums.length < 2) return 0;
        int gap = 0;
        for(int index = 0;index < nums.length-1;index++){
            if(nums[index+1] > nums[index]){
                int currentGap = nums[index+1] - nums[index];
                if(currentGap > gap){
                    gap = currentGap;
                }
            }
        }
        return gap;
    }
}
