package leetcodeSpecial;

import java.util.Arrays;

public class BuyTwoChocolate {
    public static int buyChocolate(int[] prices, int money) {
       int count = 0;
        for(int index = 0;index < prices.length;index++){
            if(index == count) continue;
            if(prices[count] + prices[index] == money){
                return 0;
            } else if (money > prices[count] + prices[index]) {
                return money - (prices[count] + prices[index]);
            }
        }
        return money;
    }

}
