import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckerTest {
    @Test
    public void testTheNumberOfHeightThatIsNotInTheirRight(){
        int [] heightOfStudents = {1,1,4,2,1,3};
        int numberOfIncorrectPosition = 3;
        assertEquals(numberOfIncorrectPosition,HeightChecker.heightChecker(heightOfStudents));

    }

}