/**
*   question : 1351. Count Negative Numbers in a Sorted Matrix
*/


public class CountNegativeNum{
    public static void main(String[] args){
        System.out.print(countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
    static public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] row:grid){
            count+=countNegativeNum(row);
        }
        return count;
    }
    static public  int countNegativeNum(int[] nums){
        int start=0, end=nums.length-1;
        while(start <= end){
            int mid= (start+end)/2;
            if(nums[mid] < 0) end = mid-1;
            else start = mid+1;
        }
        return nums.length-start;
    }
}