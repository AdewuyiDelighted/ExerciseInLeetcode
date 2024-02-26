import java.util.ArrayList;
import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        System.out.println(HeightChecker.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }

    public static int heightChecker(int[] height) {
        int[] sortedHeight = new int[height.length];
        for (int index = 0; index < height.length; index++) {
            for (int count = index + 1; count < height.length; count++) {

            }

        }
        System.out.println(Arrays.toString(sortedHeight));

        return 0;
    }

}
