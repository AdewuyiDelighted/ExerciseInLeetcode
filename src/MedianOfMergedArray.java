import java.util.Arrays;

public class MedianOfMergedArray {
    public static void main(String[] args) {
        int [] secondArray = {1,2,3};
        System.out.println((medianOfArray(secondArray)));
    }


    public static int[] mergeTwoArray(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);
        return mergedArray;

    }
    public static int[] sortArrayInAscendOrder(int [] mergedArray){
        for(int index = 0;index < mergedArray.length;index++){
            for(int count = 0; count < mergedArray.length;count++){
                if(mergedArray[index] < mergedArray[count]){
                    int temp = mergedArray[index];
                    mergedArray[index] = mergedArray[count];
                    mergedArray[count] = temp;
                }
            }
        }
        return mergedArray;
    }
    public static double medianOfArray(int [] numbers){
        int length = numbers.length;
        double totalMedian = 0;
        if(length % 2 == 0){
            int firstMedian = length / 2;
            int secondMedian = firstMedian - 1;
            totalMedian = (double) (numbers[firstMedian] + numbers[secondMedian]) /2;
        }
        else if(length % 2 != 0){
            int onlyMedian = length /2;
            totalMedian = numbers[onlyMedian];
        }
        return totalMedian;
    }

    public static double mergeSortFindMedian(int[] firstArray,int [] secondArray){
     return medianOfArray(sortArrayInAscendOrder(mergeTwoArray(firstArray,secondArray)));

    }
}
