package DailyExerciseNew;

public class NumberOfSeniorCitizens {
    public static int getNumberOfSeniorCitizen(String[] details) {
        int count = 0;
        for (String detail : details) {
            String detailAge = detail.substring(11, 13);
            int age = Integer.parseInt(detailAge);
            if (age > 60) count++;

        }
        return count;

    }
}
