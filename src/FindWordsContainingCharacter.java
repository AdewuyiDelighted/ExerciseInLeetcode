import java.util.ArrayList;

public class FindWordsContainingCharacter {


    public static int[] findWord(String[] words, String target) {
        ArrayList<Integer> keepIndexOfChar = new ArrayList<>();
        for(int index = 0;index < words.length;index++){
            String word = words[index];
            if(word.contains(target)){
                keepIndexOfChar.add(index);
            }
        }
        return Convert.convertListToArray(keepIndexOfChar);
    }
}
