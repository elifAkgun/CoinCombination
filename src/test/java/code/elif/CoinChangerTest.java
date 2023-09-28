package code.elif;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CoinChangerTest {

    @Test
    public void testCoinCombinations() {
        // Test case 1: Target amount is 0.
        int[] coins1 = {1, 5, 10, 25};
        int targetAmount1 = 0;
        int expectedCombinations1 = 1; // There is only one way to make an amount of 0.

        assertEquals(expectedCombinations1, CoinChanger.calculateCombinations(coins1, targetAmount1));

        // Test case 2: Target amount is 15.
        int[] coins2 = {1, 5, 10, 25};
        int targetAmount2 = 15;
        int expectedCombinations2 = 6; // There are 6 ways to make 15 using the given coins.

        assertEquals(expectedCombinations2, CoinChanger.calculateCombinations(coins2, targetAmount2));
    }
}
