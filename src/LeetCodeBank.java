public class LeetCodeBank {
    public static int calculateAmountSavedIn(int days) {
        int daysCounter = 0;
        int amountSaved = 0;
        int dailySavings = 1;

        while (daysCounter < days) {
            daysCounter++;
            amountSaved += dailySavings;
            dailySavings++;

            if(daysCounter == 7) {
                dailySavings = 0;

                daysCounter = 0;
            }
        }
        return amountSaved;
    }
}
