public class DivisionWithoutModAndDivide {

    public static int divideTwoIntegers(int dividend, int divisor) {
        int count = 0;
        if (divisor > 0) {
            count = greaterThanDivisorZero(dividend,divisor);
        } else if (divisor < 0) {
            count = lessThanZeroDivisor(dividend, divisor);
        }
        return count;
    }




    public static int greaterThanDivisorZero(int dividend, int divisor) {
        int count = 0;
        while (dividend > divisor) {
            dividend -= divisor;
            count++;
        }
        return count;

    }

    public static int lessThanZeroDivisor(int dividend, int divisor) {
        int count = 0;
        int negative = -1;
        while (dividend != 1) {
            dividend += divisor;
            count++;
        }
        count = negative * count;
        return count;
    }

}
