package leetcodeSpecial;

public class FractionToRecurringDecimal {

    public static String fractionToRecurringDecimal(int numerator, int denominator) {
        double fraction = (double) numerator /denominator;
        return String.valueOf(fraction);
    }
}
