/**
*   qustion : 1406. Stone Game III
*/

import java.util.Arrays;
public class StoneGame3{
    public static void main(String[] args){
        System.out.print(stoneGameIII(new int[]{1,2,3,7}));
    }
    static public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        int totalSum = 0;
        for (int val : stoneValue) totalSum += val;
        for (int i = n - 1; i >= 0; i--) {
            int sum = 0;
            for (int j = 0; j < 3 && i + j < n; j++) {
                sum += stoneValue[i + j];
                dp[i] = Math.max(dp[i], sum - (i + j + 1 < n ? dp[i + j + 1] : 0));
            }
        }
        int aliceScore = (totalSum + dp[0]) / 2;
        int bobScore = totalSum - aliceScore;
        if (aliceScore > bobScore) return "Alice";
        if (aliceScore < bobScore) return "Bob";
        return "Tie";
    }
}