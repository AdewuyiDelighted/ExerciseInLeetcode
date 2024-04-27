package leetcodeSpecial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyTwoChocolateTest {
//    @Test
//    public void testThatUserCanBuyOnlyTwoChocolate(){
//        int [] prices = {1,2,2};
//        int money = 3;
//        assertEquals(0,BuyTwoChocolate.buyChocolate(prices,money));
//    }
//    @Test
//    public void testThatUserCanBuyCannotBuyTwoBecauseMoneyIsNotEnough(){
//        int [] prices = {2,3,3};
//        int money = 3;
//        assertEquals(3,BuyTwoChocolate.buyChocolate(prices,money));
//    }
@Test
    public void testThatUserCanBuyTwoChocolateAndCollectChangeIfThereisBecauseMoneyIsNotEnough(){
        int [] prices = {6,6,3};
        int money = 10;
        assertEquals(1,BuyTwoChocolate.buyChocolate(prices,money));
    }



}