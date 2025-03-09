/**
*   question : 1470. Shuffle the Array
*/

import java.util.Arrays;

public class ShuffleArray{
    public static void main(String[] args){
        System.out.print(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
    }
    static public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i=0,index=0;i<n;i++){
            ans[index++] = nums[i];
            ans[index++] = nums[i+n];
        }
        return ans;
    }
}