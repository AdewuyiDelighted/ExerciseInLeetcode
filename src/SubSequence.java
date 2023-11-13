public class SubSequence {

    public static boolean isSubsequence(String wordOne, String wordTwo) {
        int length = wordOne.length();
        int lengthTwo = wordTwo.length();
        String add = "";
        if (length < lengthTwo) {
            for (int count = 0; count < lengthTwo; count++) {
                for (int index = 0; index < length; index++) {
                    if (wordTwo.charAt(count) == wordOne.charAt(index)) {
                        add += wordTwo.charAt(count);
                    }


                }
            }
            if (add.equals(wordOne)) {
                return true;
            }


        }
        return false;

    }


}
