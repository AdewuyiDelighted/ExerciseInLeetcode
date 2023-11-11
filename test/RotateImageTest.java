import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    @Test
    public void testThatTheLengthOfTheTwoDimensionalArrayIsEqual(){
        boolean isLengthEqual = RotateImage.checkLengthOfArray();
        assertTrue(isLengthEqual);
    }
    @Test
    public void rotateImageAtFirstRow(){
//        //int [] [] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int [] [] result = {{7,4,1},{8,5,2},{7,5,3}};
//      //int[][] answer = RotateImage.rotateAll();
//        assertArrayEquals(result,answer);
    }

}