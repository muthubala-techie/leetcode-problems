/**
*   question : 1512. Number of Good Pairs
*/

public class GoodPairs{
    public static void main(String[] args){
        System.out.print(numIdenticalPairs(new int[]{1,1,1,1}));
    }
    // take an nums array and iterate every element if the given elemets are contains duplicate add good pairs
    static public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]) ans++;
            }
        }
        return ans;
    }
}