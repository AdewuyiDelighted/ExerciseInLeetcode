package DailyExerciseNew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSeniorCitizensTest {

    @Test
    public void testThatFunctionCanReturnTheNumberOfSeniorCitizen(){
        String [] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int numberOfSeniorCitizen = 2;
        assertEquals(numberOfSeniorCitizen,NumberOfSeniorCitizens.getNumberOfSeniorCitizen(details));

    }

}