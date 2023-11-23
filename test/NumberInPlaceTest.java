import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NumberInPlaceTest {
    @Test
    public void testThatFunctionThatReturnCountOfNumberNotEqualToVal(){
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
       System.out.println(NumberInPlace.countElementNotEqualToVal(nums,val));

    }
    @Test
    public void testThatValIsNotInTheTheNewArray(){
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(Arrays.toString(NumberInPlace.arrayWithoutVal(nums, val)));
    }
    @Test
    public void testNewArrayHasLengthIsEqualToLengthOfNumberWithoutVal(){
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(Arrays.toString(NumberInPlace.arrayWithLengthCount(nums, val)));
    }
    @Test public void testThatFunctionReturnArrayWithoutVal(){
        int [] numbs = {5,7,2,8,9,10,22,1,6,2,7,8,2,9,11,34,8,2,8,};
        int val = 8;
        System.out.println(Arrays.toString(NumberInPlace.arrayWithLengthCount(numbs,val)));
        System.out.println(NumberInPlace.countElementNotEqualToVal(numbs,val));
    }

}