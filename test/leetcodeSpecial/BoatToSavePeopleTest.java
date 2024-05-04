package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatToSavePeopleTest {

    @Test public void testTheNumberOfBoatThatWouldBeUsed(){
        int [] people = {1,2};
        int limit = 3;
        assertEquals(1,BoatToSavePeople.getTheNumberOfBoat(people,limit));
    }

}