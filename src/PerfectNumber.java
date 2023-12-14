public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int index = 1; index < number; index++) {
            if (number % index == 0) {
                sum += index;
            }
        }
        return sum == number;
    }
}
