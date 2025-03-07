/**
*   question : 1920. Build Array from Permutation
*/

import java.util.Arrays;

public class ArrayPermutation{
    public static void main(String[] args){
        System.out.print(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
    }
    
    static public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}