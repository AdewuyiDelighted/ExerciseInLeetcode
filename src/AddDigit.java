public class AddDigit {
    public static void main(String[] args) {
        System.out.println(addDigit(5678));
    }

    public static int tenTimesLength(int input) {
        String stringInput = String.valueOf(input);
        int length = stringInput.length();
        int product = 1;
        for (int index = 0; index < length; index++) {
            product *= 10;
        }
        return product / 10;
    }

    public static int returnOneDigit(int number) {
        int divider = tenTimesLength(number);
        int sum = 0;
        while (divider != 0) {
            int unitNumber = number / divider % 10;
            sum += unitNumber;
            divider /= 10;
        }
        return sum;
    }

    public static int addDigit(int number) {
        int total = 0;
        int answer = returnOneDigit(number);
        while (answer > 9) {
            answer = returnOneDigit(answer);
        }
        if (answer <= 9) {
            total = answer;
        }
        return total;
    }
}

