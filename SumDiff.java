/**
*   qustion : 2574. Left and Right Sum Differences
*/

import java.util.*;

public class SumDiff{
    public static void main(String[] args){
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10,4,8,3})));
    }
    static public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int leftIndex=0; leftIndex<i; leftIndex++){
                leftSum += nums[leftIndex];
            }
            for(int rightIndex=i+1; rightIndex<nums.length; rightIndex++){
                rightSum +=nums[rightIndex];
            }
            ans[i] = Math.abs(leftSum-rightSum);
        }
        return ans;
    }
}