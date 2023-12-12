package geekForGeeks;

public class WaveArray {

    public static int[] waveArray(int length, int[] array) {
        for(int index = 0;index < length -1;index += 2){
            int temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }
        return array;
    }
}
