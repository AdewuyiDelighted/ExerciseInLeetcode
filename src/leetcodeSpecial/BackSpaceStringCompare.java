package leetcodeSpecial;

public class BackSpaceStringCompare {


    public static boolean backSpaceStringCompare(String firstInput, String secondInput) {
        String afterBackSlash = String.valueOf(removeBackSlash(firstInput));
        String afterBackSlashTwo = String.valueOf(removeBackSlash(secondInput));
        return afterBackSlash.equals(afterBackSlashTwo);
    }

    private static StringBuilder removeBackSlash(String word) {
        StringBuilder stringBuilderWord = new StringBuilder(word);
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == '#') {
                int backSpaceIndex = stringBuilderWord.indexOf(String.valueOf(word.charAt(index)));
                if (backSpaceIndex == 0) continue;
                stringBuilderWord.deleteCharAt(backSpaceIndex);
                stringBuilderWord.deleteCharAt(backSpaceIndex - 1);

            }
        }
        return stringBuilderWord;
    }
}
