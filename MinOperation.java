/**
*   qustion : 3065. Minimum Operations to Exceed Threshold Value I
*/

public class MinOperation{
    public static void main(String[] args){
        System.out.print(minOperations(new int[]{2,11,10,1,3} , 10));
    }
    static public int minOperations(int[] nums, int k) {
        int ans = 0;
        for(int num:nums){
            if(num<k) ans++;
        }
        return ans;
    }
}