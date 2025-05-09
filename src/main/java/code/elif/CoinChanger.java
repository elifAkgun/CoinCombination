package code.elif;

/**
 * This program calculates the number of combinations to make a target amount
 * using a given set of coin denominations.
 * <p>
 * Given a target amount and a list of coin denominations, it computes how many
 * combinations of coins can be used to make up the target amount.
 * </p>
 *
 * @author Elif Akgün
 * @version 1.0
 * @since 28.09.2023
 */
public class CoinChanger {

    public static void main(String[] args) {
        // Define the target amount to be calculated.
        int targetAmount = 15;

        // Define the available coin denominations.
        int[] coins = {1, 5, 10, 25};
        int calculateCombinations = calculateCombinations(coins, targetAmount);

        // Display the total number of combinations to make the target amount.
        System.out.println("Number of Combinations: " + calculateCombinations);
    }

    public static int calculateCombinations(int[] coins, int targetAmount) {
        // Create an array to store the number of combinations for each amount.
        int[] dp = new int[targetAmount + 1];

        // Initialize the base case: There is one way to make an amount of 0 (no coins).
        dp[0] = 1;

        // Iterate through each coin denomination.
        for (int coin : coins) {
            // Iterate through each amount from the current coin value up to the target amount.
            for (int i = coin; i <= targetAmount; i++) {
                // Update the number of combinations for the current amount.
                dp[i] += dp[i - coin];
            }
        }

        return dp[targetAmount];
    }
}
