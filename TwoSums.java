/**
*   qustion : 1. Two Sum
*/


import java.util.*;

public class TwoSum{
    public static void main(String[] args){
        System.out.print(Arrays.toString(twoSum(new int[]{2,7,11,15} , 9)));
    }
    static public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; 
    }
}