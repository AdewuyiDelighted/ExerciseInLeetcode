public class LengthLastWord {

    public static int findTheLastLength(String words) {
        int count = 0;
        int length = words.length();
        int indexOfLength = length - 1;
        for (int index = indexOfLength; index > 0; index--) {
            count ++;
            String letter = String.valueOf(words.charAt(index));
            if(letter.equals(" ")){
                break;
            }
        }
        return count -1;
    }

}
