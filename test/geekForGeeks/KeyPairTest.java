package geekForGeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyPairTest {
    @Test public void functionFindTheTwoElementThatCanSumTarget(){
        int target = 16;
        int [] array = {1,4,45,6,10,8};
        boolean answer = KeyPair.keyPair(target,array);
        assertTrue(answer);
    }
    @Test public void functionFindTheTwoElementThatCanSumTargetWhenElementAreInAscendingOrder(){
        int target = 10;
        int [] array = {1,2,3,4,5,6};
        boolean answer = KeyPair.keyPair(target,array);
        assertTrue(answer);
    }
    @Test public void functionReturnFalseWhenTheTwoElementThatCanSumTargetAreNotFound(){
        int target = 12;
        int [] array = {9,2,1,0,8};
        boolean answer = KeyPair.keyPair(target,array);
        assertFalse(answer);
    }




}