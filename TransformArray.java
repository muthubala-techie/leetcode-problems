/**
*   question : 3467. Transform Array by Parity
*/

import java.util.Arrays;

public class TransformArray{
    public static void main(String[] args){
        System.out.print(Arrays.toString(transformArray(new int[]{4,3,2,1})));
    }
    static public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0) nums[i]=0;
            else nums[i] =1;
        }
        Arrays.sort(nums);
        return nums;
    }
}