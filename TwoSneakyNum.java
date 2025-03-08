/**
*   question : 3289. The Two Sneaky Numbers of Digitville
*/

import java.util.Arrays;
import java.util.ArrayList;

public class TwoSneakyNum{

    public static void main(String[] args){
        System.out.print(Arrays.toString(getSneakyNumbers(new int[]{7,1,5,4,3,4,6,0,9,5,8,2})));
    }
    // take an array input iterate every element if that element have duplicate value return that elements as a new array as ans
    static public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[0];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            if(nums[i] == nums[j]){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = nums[i];
            }
        }
        ans = sort(ans);
        return  ans;
    }
    static public int[] sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}