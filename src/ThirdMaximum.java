import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ThirdMaximum {
    Date date;

    public void setDate(Date date) {
        this.date = date;

    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 6, 2, 3};
        int[] answer = {3, 2, 5, 4, 6};
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
        int thirdMax = 0;
        int maxCounter = 0;

        int[] allElement = sortedDistinct(numbers);
        for(int count = 0;count < allElement.length;count++) {
            for (int index = count + 1; index < allElement.length; index++) {
                int maximum = allElement[count];
                if (maximum > allElement[index]) {
                   maxCounter++;
                }
                if(maxCounter == index); int anotherCounter++;
                if (maxCounter == 3) {
                    thirdMax = allElement[count];
                }

            }
        }
        return thirdMax;
    }

}
