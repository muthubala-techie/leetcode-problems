/*
*   question : 1929. Concatenation of Array
*/

import java.util.Arrays;

public class ConcatArray{

    public static void main(String[] args){
        System.out.print(Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }

    // take input as array and return concat array+array
    static public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }

}