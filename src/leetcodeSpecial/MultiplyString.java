package leetcodeSpecial;

public class MultiplyString {


    public static String multiplyString(String firstWord, String secondWord) {
        int firstNumber = getIntValue(firstWord);
        int secondNumber = getIntValue(secondWord);
        int answer = firstNumber * secondNumber;
        return String.valueOf(answer);
    }

    private static int getIntValue(String strNumber) {
        int value = 0;
        int tens = 1;
        for(int count = 0;count < strNumber.length()-1;count++){
            tens *= 10;
        }
        for(int index = 0; index < strNumber.length(); index++){
            char charValue = strNumber.charAt(index);
            int intValue = charValue - '0';
            value += intValue * tens;
            tens /=10;
        }
        return value;
    }
}
