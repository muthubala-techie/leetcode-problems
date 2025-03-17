/**
*   question : 2373. Largest Local Values in a Matrix
*/

import java.util.Arrays;

public class LargetLocalValue{
    public static void main(String[] args){
        int[][] ans = largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}});
        for(int[] ele:ans){
            System.out.print(Arrays.toString(ele));
        }
    }
    static public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int maxVal = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        maxVal = Math.max(maxVal, grid[x][y]);
                    }
                }
                result[i][j] = maxVal;
            }
        }
        return result;
    }
}