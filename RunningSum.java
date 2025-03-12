/**
*   qustion : 1480. Running Sum of 1d Array
*/

import java.util.Arrays;

public class RunningSum{
    public static void main(String[] args){
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
    static public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum +=nums[i];
            nums[i] =sum;
        }
        return nums;
    }
}