/**
*   question : 2044. Count Number of Maximum Bitwise-OR Subsets
*/

public class CountSubset{

    static int maxOr = 0, count = 0;

    public static void main(String[] args){
        System.out.print(countMaxOrSubsets(new int[]{3,1}));
    }

    static public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) {
            maxOr |= num;
        }
        backtrack(nums, 0, 0);
        return count;
    }

    static public void backtrack(int[] nums, int index, int currentOr) {
        if (index == nums.length) {
            if (currentOr == maxOr) count++;
            return;
        }
        backtrack(nums, index + 1, currentOr | nums[index]);
        backtrack(nums, index + 1, currentOr);
    }
}