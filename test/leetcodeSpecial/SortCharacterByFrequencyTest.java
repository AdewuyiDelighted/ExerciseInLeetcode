package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class SortCharacterByFrequencyTest {
    @Test
    public void testThatFunctionCanSortFrequencyByCharacter() {
        String word = "tree";
        String output = "eert";
        assertEquals(output, SortCharacterByFrequency.sortFrequency(word));
    }

    public static void main(String[] args) {
        String word = "124586";
        System.out.println(Arrays.toString(Pattern.compile(word).split(":", 0)));
        String words = "mathematics";
        StringBuilder stringBuilder = new StringBuilder("Mathematics");

//        System.out.println(stringBuilder.insert(stringBuilder.length()-1, "."));

        System.out.println(stringBuilder.length());
        for (int index = 0; index < 4; index++) {
            Random random = new Random();
            int num = random.nextInt(1,stringBuilder.length()-1);
            System.out.println(stringBuilder.insert(num, "."));
        }

    }

}