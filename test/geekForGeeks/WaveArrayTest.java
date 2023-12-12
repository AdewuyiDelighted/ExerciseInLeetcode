package geekForGeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaveArrayTest {
    @Test
    public void testThatArrayAreArrangeInWaveSequence(){
        int length = 5;
        int [] array = {1,2,3,4,5};
        int [] excepted = {2,1,4,3,5};
        assertArrayEquals(excepted,WaveArray.waveArray(length,array));
    }
    @Test
    public void testThatArrayAreArrangeInWaveSequenceWhenTheNumberArentInOrder(){
        int length = 6;
        int [] array = {2,4,7,8,9,10};
        int [] excepted = {4,2,8,7,10,9};
        assertArrayEquals(excepted,WaveArray.waveArray(length,array));
    }



}