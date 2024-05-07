package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperPowTest {
    @Test public void testFunctionOfTheGiveNumberAndArray(){
        int number = 2;
        int [] array = {3};
        assertEquals(8,SuperPow.getSuperPow(number,array));
    }
    @Test public void testFunctionOfTheGiveNumberAndArrayWhenArrayInputIs1And0(){
        int number = 2;
        int [] array = {1,0};
        assertEquals(1024,SuperPow.getSuperPow(number,array));
    }

    @Test
    public void testFunctionOfTheGiveNumberAndArrayWhenArrayInputIsLong() {
        int number = 1;
        int[] array = {4,3,3,8,5,2};
        assertEquals(1, SuperPow.getSuperPow(number, array));
    }

}