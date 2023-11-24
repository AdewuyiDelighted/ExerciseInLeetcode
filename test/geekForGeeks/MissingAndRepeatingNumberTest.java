package geekForGeeks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MissingAndRepeatingNumberTest {
    @Test
    public void testThatWhenAnArrayOfNumberIsInputted_theMissingNumberIsPrintedOut() {
        int[] array = {3, 1, 3};
        System.out.println(MissingAndRepeatingNumber.findMissingNumber(array));

    }

    @Test
    public void testThatWhenAnArrayOfNumberIsInputted_theMissingNumberIsPrintedOut_Even_WhenTheLengthIsMoreThanThree() {
        int[] array = {4, 3, 6, 2, 1, 1};
        System.out.println(MissingAndRepeatingNumber.findMissingNumber(array));
    }
}
