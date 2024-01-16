import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeBankTest {
    @Test
    public void testThatTheMoneyOfMoneyHercyHaveAfterSavingInLeetCodeFor4Days() {
        int days = 4;
        int exceptedSavings = 10;
        assertEquals(exceptedSavings, LeetCodeBank.calculateAmountSavedIn(days));
    }

    @Test
    public void testThatTheMoneyOfMoneyHercyHaveAfterSavingInLeetCodeFor10Days() {
        int days = 10;
        int exceptedSavings = 37;
        assertEquals(exceptedSavings, LeetCodeBank.calculateAmountSavedIn(days));
    }
    @Test
    public void testThatTheMoneyOfMoneyHercyHaveAfterSavingInLeetCodeFor20Days() {
        int days = 20;
        int exceptedSavings = 96;
        assertEquals(exceptedSavings, LeetCodeBank.calculateAmountSavedIn(days));
    }




}