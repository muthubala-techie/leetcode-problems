/**
*   qustion : 153. Find Minimum in Rotated Sorted Array
*/

public class FindMinRotatedArray{
    public static void main(String[] args){
        System.out.print(findMin(new int[]{3,4,5,1,2}));
    }
    static public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return nums[left];
    }
}