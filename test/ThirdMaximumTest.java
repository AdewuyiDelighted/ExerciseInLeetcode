import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdMaximumTest {
     @Test
     public void elementInTheArrayAreDistinctNumbersInList(){
          int []  numbers = {3,2,5,4,6,2,3};
          List<Integer> answer = Arrays.asList(3,2,5,4,6);
          List<Integer> distinctNumbers = ThirdMaximum.distinctOf(numbers);
          assertEquals(answer,distinctNumbers);
     }
     @Test
     public void elementInTheArrayAreDistinctNumbersInArray(){
          int []  numbers = {3,2,5,4,6,2,3};
          int [] answer = {3,2,5,4,6};
          int []  distinctNumbers = ThirdMaximum.convertToArray(numbers);
          assertArrayEquals(answer,distinctNumbers);
     }
     @Test
     public void elementInTheArrayAreDistinctNumbersAndTheyAreSortedInDescendingOrder(){
          int []  numbers = {3,2,5,4,6,2,3};
          int [] answer = {6,5,4,3,2};
          int []  distinctNumbers = ThirdMaximum.sortedDistinct(numbers);
          assertArrayEquals(answer,distinctNumbers);
     }
     @Test
     public void testThatFunctionReturnTheThirdMaximumDistinctNumberInTheArray(){
          int []  numbers = {3,2,5,4,6,2,3};
          int answer  = 4;
          int  distinctNumbers = ThirdMaximum.findThirdMaximum(numbers);
          assertEquals(answer,distinctNumbers);
     }
     @Test
     public void testThatFunctionReturnTheMaximum_ifTheLengthOfArrayINotUpToThree(){
          int [] numbers = {34,56};
          int answer = 56;
          assertEquals(answer,ThirdMaximum.findThirdMaximum(numbers));

     }




}
