import java.util.*;

public class FinalArray{
    public static void main(String[] args){
        System.out.println(Arrays.toString(getFinalState(new int[]{2,1,3,5,6},5,2)));
    }
    static public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int length = 1; length<=k; length++){
            int minIndex = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] < nums[minIndex]) minIndex = i;
            }
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}