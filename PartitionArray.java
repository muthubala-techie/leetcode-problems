/**
*   question : 2161. Partition Array According to Given Pivot
*/


import java.util.*;
public class PartitionArray{
    public static void main(String[] args){
        System.out.print(Arrays.toString(pivotArray(new int[]{9,12,5,10,14,3,10} ,10 )));
    }
    static public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }
        int index = 0;
        for (int num : less) nums[index++] = num;
        for (int num : equal) nums[index++] = num;
        for (int num : greater) nums[index++] = num;
        return nums;
    }
}