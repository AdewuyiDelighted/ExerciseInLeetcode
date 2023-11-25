public class DetectCapital {

    public static boolean detectCapital(String word) {
        int count = 0;
        String firstLetter = String.valueOf(word.charAt(0));
        String capitalFirstLetter = firstLetter.toUpperCase();
        for (int index = 0; index < word.length(); index++) {
            String initialLetter = String.valueOf(word.charAt(index));
            String capitalLetter = initialLetter.toUpperCase();
            if (initialLetter.equals(capitalLetter)) {
                count++;
            }
        }
            if(count == word.length() || (firstLetter.equals(capitalFirstLetter) && count == 1)){
                return true;
            }

        return false;
    }
}
