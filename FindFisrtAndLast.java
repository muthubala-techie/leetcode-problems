/**
*   qustion : 34. Find First and Last Position of Element in Sorted Array
*/

import java.util.Arrays;

public class FindFirstAndLast{
    public static void main(String[] args){
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10} , 6)));
    }
    static public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};   
        ans[0] = searh(nums,target,true);
        ans[1] = searh(nums,target,false);
        return ans;
    }
    static public int searh(int[] nums,int target,boolean isFirtstIndex){
        int start = 0 , end = nums.length-1 , ans = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                ans = mid;
                if(isFirtstIndex) end = mid-1;
                else start = mid+1;
            }else if(target < nums[mid]) end = mid-1;
            else start = mid+1;
        }
        return ans;
    }
}