import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void when_an_input_is_entered_if_number_from_one_to_the_input_divided_by_3_reminder_0_number_is_equal_Fizz() {
        int number = 3;
        ArrayList<String> words = new ArrayList<>(Arrays.asList("1", "2", "Fizz"));
        assertEquals(words, FizzBuzz.fizzbuzz(number));

    }

    @Test
    public void when_an_input_is_entered_if_number_from_one_to_the_input_divided_by_5_reminder_0_number_is_equal_Buzz() {
        int number = 5;
        ArrayList<String> words = new ArrayList<>(Arrays.asList("1", "2", "Fizz", "4", "Buzz"));
        assertEquals(words, FizzBuzz.fizzbuzz(number));
    }

    @Test
    public void when_i_input_number_number_divided_by_three_would_return_fizz_while__number_divided_by_five_would_return_buzz_test() {
        int number = 10;
        ArrayList<String> words = new ArrayList<>(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"));
        assertEquals(words, FizzBuzz.fizzbuzz(number));

    }
    @Test public void testThat_when_number_divided_by_3_and_5_reminder_0_would_return_fizzbuzz(){
        int number = 15;
        ArrayList<String> words = new ArrayList<>(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz","11","Fizz","13","14","FizzBuzz"));
        assertEquals(words, FizzBuzz.fizzbuzz(number));

    }


}