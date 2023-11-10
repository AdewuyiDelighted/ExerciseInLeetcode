import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertPositionTest {
    @Test
    public void testThatFunctionReturnTheIndexOfTargetInGivenArrayAfterSorting() {
        int[] givenArray = {1, 5, 6, 3};
        int target = 5;
        int answer = 2;
        int confirmResult = InsertPosition.findPosition(target, givenArray);
        assertEquals(answer, confirmResult);
    }
    @Test
    public void testThatFunctionWouldReturnTheIndexWhereItWouldHaveBeenIfTheTargetIsNotFoundAfterSorting(){
        int [] givenArray = {18,12,16,14,10};
        int target = 17;
        int answer = 4;
        int confirmAnswer = InsertPosition.findPosition(target,givenArray);
        assertEquals(answer,confirmAnswer);
    }
    @Test
    public void testThatIfTargetIsNotInTheArrayAndWhereTargetWouldHaveBeenIsNotInTheArrayReturnTheLastIndexPlusOne(){
        int [] givenArray = {49,37,24,30,41};
        int target = 52;
        int answer = 5;
        int confirmAnswer = InsertPosition.findPosition(target,givenArray);
        assertEquals(answer,confirmAnswer);

    }




}