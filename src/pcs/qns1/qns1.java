package pcs.qns1;

import java.util.Arrays;

public class qns1 {

	public int coinChangeInt(int[] coins, int amount) {
	    if(amount<1) return 0;
		int[] dp = new int[amount+1];
		 dp[0] = 0; //for $0, no coins needed
		    
		 // for everything else
		 for (int amt = 1; amt <= amount; amt++) {
			 dp[amt] = Integer.MAX_VALUE;
			 
			 for (int j = 0; j < coins.length; j++) {
				 if (coins[j] <= amt) { // check if coin value is less than amount
					 // select the coin and add 1 to solution of (amount-coin value)
					 dp[amt] = Math.min(dp[amt - coins[j]] + 1, dp[amt]) ;
				 }
            }
        }

		 return dp[amount];
	}
	 
	 public int coinChange(double[] coins, double amount) {
		 Arrays.sort(coins);
		 double mult = getMult(coins[0]) > 0 ? getMult(coins[0]) : 1;
		 
		 int newAmount = (int) (amount / mult);
		 int[] newCoins = new int[coins.length];
		 int denomNumCounter = 0;
		 
		 for(double coin : coins) {
			 newCoins[denomNumCounter] = (int) (coin / mult);
			 denomNumCounter++;
		 }

		// System.out.println(newAmount + " and " + Arrays.toString(newCoins));
		 
		 int results = coinChangeInt(newCoins, newAmount);
		 
		 return results;
	 }
	 
	 public double getMult(double amount) {
		if(amount % 1 == 0 ) return 0;
		 
		double mult = 1;
		 
		while(amount % 1 != 0) {
			amount = amount * 10;
			mult = mult / 10;
		}
		 
		 return mult;
	 }
	 
}