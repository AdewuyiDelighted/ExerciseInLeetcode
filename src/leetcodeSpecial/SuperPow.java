package leetcodeSpecial;

public class SuperPow {
    public static int getSuperPow(int number, int[] array) {
        return (int) Math.pow(number,getSumOfArray(array));

    }

    private static int getSumOfArray(int []array) {
        StringBuilder sum = new StringBuilder();
        for (int index = 0; index < array.length; index++) {
            sum.append(array[index]);
        }
        return Integer.parseInt(sum.toString());
    }
}
