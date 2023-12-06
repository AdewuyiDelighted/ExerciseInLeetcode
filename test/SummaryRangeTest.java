import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangeTest {
    @Test
    public void testThatFunctionReturnTheIndexAtWhichNumberAreInRange(){
        int [] nums = {0,1,2,4,5,7};
        String [] answer = {"0->2","4->5","7"};
        assertEquals(answer,SummaryRange.sortRange(nums));
    }

}