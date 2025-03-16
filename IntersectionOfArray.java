/**
*   question : 349. Intersection of Two Arrays
*/


import java.util.Arrays;

public class IntersectionOfArray{
    public static void main(String[] args){
        System.out.print(Arrays.toString(intersection(new int[]{4,9,5},new int[]{9,4,9,8,4})));
    }
    static public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ans = new int[0];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            if(i+1 != nums1.length && nums1[i] == nums1[i+1]) continue;
            if(search(nums2,nums1[i]) != -1){
                ans = addElement(ans);
                ans[index++] = nums1[i];
            }
        }
        return ans;
    }
    static public int[] addElement(int[] nums){
        return Arrays.copyOf(nums,nums.length+1);
    }
    static public int search(int[] nums,int target){
        int start=0, end=nums.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if (nums[mid] == target) return mid;
            else if(nums[mid] < target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}