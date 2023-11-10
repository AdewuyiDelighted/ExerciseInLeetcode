public class PlusOne {
    public static String covertArrayToString(int[] array) {
        String arrayToString = "";
        for (int index = 0; index < array.length; index++) {
            arrayToString += array[index];
        }
        return arrayToString;
    }

    public static int convertStringToIntAndAddOne(String array) {
        int stringToInt = Integer.parseInt(array);
        return stringToInt + 1;
    }

    public static String[] convertToArray(int array) {
        String words = String.valueOf(array);
        String[] number = new String[words.length()];
        for (int index = 0; index < number.length; index++) {
            number[index] = String.valueOf(words.charAt(index));
        }
        return number;
    }

    public static String[] combineAll(int[] array) {
        String newArray = covertArrayToString(array);
        int newInt = convertStringToIntAndAddOne(newArray);
        return convertToArray(newInt);

    }
}
