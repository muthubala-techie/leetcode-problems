/**
*   1672. Richest Customer Wealth
*/

public class CustomerWealth{
    public static void main(String[] args){
        System.out.println(maximumWealth(new int[][] {{1,2,3},{3,2,1}}));
    }
    static public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] account:accounts){
            int totalWealth = 0;
            for(int wealth:account){
                totalWealth+= wealth;
            }
            max = totalWealth>max?totalWealth:max;
        }
        return max;
    }
}