public class LeetCodeBank {
    public static int calculateAmountSavedIn(int days) {
        int daysCounter = 0;
        int sevenDays = 7;
        int amountSaved = 0;
        int dayOneWeekSavings = 1;
        int dailySavings = dayOneWeekSavings;

        while (daysCounter < days) {
            daysCounter++;
            amountSaved += dailySavings;
            dailySavings++;

            if (daysCounter == sevenDays) {
                dayOneWeekSavings++;
                dailySavings = dayOneWeekSavings;
                sevenDays *= 2;
            }
        }
        return amountSaved;
    }
}
