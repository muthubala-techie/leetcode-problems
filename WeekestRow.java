/**
*   question : 1337. The K Weakest Rows in a Matrix
*/


import java.util.Arrays;

public class WeekestRow{
    public static void main(String[] args){
        int[][] nums = {{1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}
                    };
        System.out.print(Arrays.toString(kWeakestRows(nums,3)));
    }
    static public int[] kWeakestRows(int[][] mat, int k) {
        int[] noOfSolider = new int[mat.length];
        int[] ans = new int[k];
        for(int i=0;i<mat.length;i++){
            noOfSolider[i] = findNumOfSolider(mat[i]);
        }
        for(int i=0,index=0;i<k;i++,index++){
            int minIndex = 0;
            for(int j=0;j<noOfSolider.length;j++){
                if(noOfSolider[j] < noOfSolider[minIndex]){ 
                    minIndex = j;
                };
            }
            ans[index] = minIndex;
            noOfSolider[minIndex] = Integer.MAX_VALUE;
        }
        return ans;
    }
    static public int findNumOfSolider(int[] row){
        int noOfSolider = 0;
        for(int item:row){
            noOfSolider += item;
        }
        return noOfSolider;
    }
}