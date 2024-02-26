import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationTest {
    @Test public void testThatFunctionReturnAllTheCombinationInTheRangeOfGivenTwoNumber(){
        int firstInput = 4;
        int secondInput = 2;
        int [][] expected = {{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}};
        assertArrayEquals(expected,Combination.combination(firstInput,secondInput));
    }

}