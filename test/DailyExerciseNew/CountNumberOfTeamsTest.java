package DailyExerciseNew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNumberOfTeamsTest {
    @Test public void testThatFunctionCanReturnTheNumberOfTeamsCount(){
        int [] rating = {2,5,3,4,1};
        int teamCount = 3;
        assertEquals(teamCount,CountNumberOfTeams.countNumberOfTeam(rating));
    }

}