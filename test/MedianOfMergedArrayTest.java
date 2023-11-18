import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfMergedArrayTest {
    @Test
    public void testThatTwoDifferentArrayCanBeMergedTogether(){
        int [] firstArray = {1,3};
        int [] secondArray = {2};
        int [] mergedArray = {1,3,2};
        assertArrayEquals(mergedArray,MedianOfMergedArray.mergeTwoArray(firstArray,secondArray));
    }
    @Test
    public void testThatTwoDifferentArrayWithLongerLengthCanBeMerged(){
        int [] firstArray = {1,4,5,6,8,9,3,2,4,5,6,8,2};
        int [] secondArray = {7,8,2,3,1,6,9,0,3,4,2,6,5};
        int [] mergedArray = {1,4,5,6,8,9,3,2,4,5,6,8,2,7,8,2,3,1,6,9,0,3,4,2,6,5};
        assertArrayEquals(mergedArray,MedianOfMergedArray.mergeTwoArray(firstArray,secondArray));
    }
    @Test
    public void testThatArrayIsSortedInAscendingOrder(){
        int [] unsortedArray = {1,4,5,6,8,9,3,2,4,5,6,8,2,7,8,2,3,1,6,9,0,3,4,2,6,5};
        int [] sortedArray = {0,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,6,7,8,8,8,9,9};
        assertArrayEquals(sortedArray,MedianOfMergedArray.sortArrayInAscendOrder(unsortedArray));
    }
    @Test
    public void testThatFunctionCanFindTheMedianOfAnArray(){
        int [] sortedArray = {0,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,6,7,8,8,8,9,9};
        double answer = 4.5;
        assertEquals(answer,MedianOfMergedArray.medianOfArray(sortedArray));
    }
    @Test
    public void ifATwoDifferentArrayIsGiven_FunctionWould_merged_sort_and_returnItsMedian_test(){
        int [] firstArray = {10,17,15,9,12,4};
        int [] secondArray = {9,14,6,11,4,8,13};
        double answer = 10.0;
        assertEquals(answer,MedianOfMergedArray.mergeSortFindMedian(firstArray,secondArray));
    }





}