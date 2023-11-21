import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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
        System.out.println(Arrays.toString(NumberInPlace.numberInPlace(nums, val)));
    }

}