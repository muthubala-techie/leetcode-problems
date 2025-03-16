/**
*   question : 2089. Find Target Indices After Sorting Array
*/

import java.util.*;

public class FindTargetIndices{
    public static void main(String[] args){
        List<Integer> ans = targetIndices(new int[]{1,2,2,5,2,3} , 2); // 1,2,2,3,5
        System.out.print(ans.toString());
    }
    static public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int firstIndex = search(nums,target);
        if(firstIndex == -1) return ans;
        for(int i=firstIndex;i != nums.length && nums[i] == target;i++) ans.add(i);
        return ans;
    }
    static public int search(int[] nums,int target){
        int ans= -1;
        int start=0, end=nums.length-1;
        while(start <= end){
            int mid= (start+end)/2;
            if(nums[mid]== target){
                ans = mid;
                end=mid-1;
            }else if(nums[mid] < target)start=mid+1;
            else end=mid-1;
        }
        return ans;
    }
    static public int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}