import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ThirdMaximum {

    public static void main(String[] args) {
        int[] numbers = {2,2,3,1};
        System.out.println(findThirdMaximum(numbers));

    }

    public static ArrayList<Integer> distinctOf(int[] numbers) {
        ArrayList<Integer> distinctNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (!distinctNumbers.contains(number)) {
                distinctNumbers.add(number);
            }
        }
        return distinctNumbers;
    }

    public static int[] convertToArray(int[] numbers) {
        ArrayList<Integer> collectDistinctNumbers = distinctOf(numbers);
        int[] array = new int[collectDistinctNumbers.size()];
        for (int index = 0; index < collectDistinctNumbers.size(); index++) {
            array[index] = collectDistinctNumbers.get(index);
        }
        return array;
    }

    public static int[] sortedDistinct(int[] numbers) {
        int[] arrayOfSortedDistinct = convertToArray(numbers);
        Sort.descending(arrayOfSortedDistinct);
        return arrayOfSortedDistinct;
    }

    public static int findThirdMaximum(int[] numbers) {
        int[] allElement = sortedDistinct(numbers);
        int thirdMax = 0;
        if(allElement.length >= 3){
            thirdMax = allElement[2];
        }else {
            thirdMax = allElement[0];
        }

        return thirdMax;
    }

}
