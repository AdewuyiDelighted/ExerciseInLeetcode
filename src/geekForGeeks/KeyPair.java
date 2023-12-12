package geekForGeeks;

public class KeyPair {
    public static boolean keyPair(int target,int[] array) {

        for(int index = 0; index < array.length;index++){
            for(int count = index +1; count < array.length;count++){
                if(array[index] + array[count] == target) return true;
            }
        }
        return false;
    }
}
