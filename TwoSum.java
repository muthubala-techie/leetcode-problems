/**
*   qustion : 167. Two Sum II - Input Array Is Sorted
*/


import java.util.Arrays;

public class TwoSum{
    public static void main(String[] args){
        System.out.print(Arrays.toString(twoSum(new int[]{2,7,11,15} , 9)));
    }
    static public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}