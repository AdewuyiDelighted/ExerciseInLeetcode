package DailyExerciseNew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortThePeopleTest {
    @Test
    public void testThatFunctionCanSortPeopleHeight(){
        String [] names = {"Mary","John","Emma"};
        int [] heights = {180,165,170};
        String [] results = {"Mary","Emma","John"};
        assertArrayEquals(results,SortThePeople.sortThePeople(names,heights));

    }

}