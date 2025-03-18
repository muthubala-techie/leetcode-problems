/**
*   question : 2529. Maximum Count of Positive Integer and Negative Integer
*/


public class MaxCount{
    public static void main(String[] args){
        System.out.print(maximumCount(new int[]{-1764,-1562,-1226,-1216,-402,-386,-133,979,1227,1992}));
    }
    static public int maximumCount(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int negCount = start; 
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] <= 0) { 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int posCount = nums.length - start; 
        return Math.max(negCount, posCount);
    }
}