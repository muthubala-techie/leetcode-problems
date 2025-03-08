/**
*   question : 3190. Find Minimum Operations to Make All Elements Divisible by Three
*/

public class FindOperation{
    public static void main(String[] ans){
        System.out.print(minimumOperations(new int[]{1,2,3,4}));
    }
    static public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int num:nums){
            if(!(num%3 == 0)) ans ++;
        }
        return ans;
    }
}