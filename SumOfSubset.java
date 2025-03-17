/**
*   question : 1863. Sum of All Subset XOR Totals
*/

public class SumOfSubset{
    public static void main(String[] args){
        System.out.print(subsetXORSum(new int[]{1,3}));
    }
    static public int subsetXORSum(int[] nums) {
        return backtrack(nums, 0, 0);
    }
    static private int backtrack(int[] nums, int index, int currentXor) {
        if (index == nums.length) {
            return currentXor;
        }
        int include = backtrack(nums, index + 1, currentXor ^ nums[index]);
        int exclude = backtrack(nums, index + 1, currentXor);
        return include + exclude;
    }
}