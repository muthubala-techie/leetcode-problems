/**
*   qustion : 1365. How Many Numbers Are Smaller Than the Current Number
*/

import java.util.Arrays;

public class SmallNum{
    public static void main(String[] args){
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{6,5,4,8})));
    }
    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int currentNum=0; currentNum<nums.length; currentNum++){
            int countOfSmall = 0;
            for(int anotherNum=0; anotherNum<nums.length; anotherNum++){
                if(nums[anotherNum] < nums[currentNum]) countOfSmall++;
            }
            ans[currentNum] = countOfSmall;
        }
        return ans;
    }
}