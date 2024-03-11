package leetcodeSpecial;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        System.out.println(sortFrequency("tree"));
    }

    public static String sortFrequency(String word) {
        for (int index = 0; index < word.length(); index++) {
            for (int count = 0; count < word.length(); count++) {
                int upperLetter = word.charAt(index);
                int lowerLetter = word.charAt(count);
                if (lowerLetter < upperLetter) {
                    char letter = word.charAt(index);
                    char letter2 = word.charAt(count);
                    word =  word.replace(word.charAt(index),word.charAt(count));
//                    word.at()



                }
            }
        }
        return word;
    }
}
