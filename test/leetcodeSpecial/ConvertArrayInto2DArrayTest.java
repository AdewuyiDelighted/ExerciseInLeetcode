package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertArrayInto2DArrayTest {

    @Test
    public void testThatFunctionCanConvertArrayIntoTwoDArray(){
        int [] input =  {1,3,4,1,2,3,1};
        int [][] output =  {{1,3,4,2},{1,3},{1}};
        assertArrayEquals(output,ConvertArrayInto2DArray.convertArrayToTwoDArray(input));

    }
}