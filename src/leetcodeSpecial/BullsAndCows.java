package leetcodeSpecial;

import org.jetbrains.annotations.NotNull;

public class BullsAndCows {
    public static void main(String[] args) {
        System.out.println(getHint("1123", "0111"));
    }


    public static String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        for (int index = 0; index < secret.length(); index++) {
            if (secret.charAt(index) == guess.charAt(index)) {
                bull++;
            }
            if (secret.charAt(index) != guess.charAt(index)) {
                if (guess.contains(String.valueOf(secret.charAt(index)))) {
                    cow++;
                }
            }
        }
        return bull + "A" + cow + "B";

    }
}
