/**
*   qestion : 2824. Count Pairs Whose Sum is Less than Target
*/
import java.util.*;

public class CountPairs{
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(-6);
        nums.add(2);
        nums.add(5);
        nums.add(-2);
        nums.add(-7);
        nums.add(-1);
        nums.add(3);
        System.out.println(countPairs(nums, -2));
    }
    static public int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i) + nums.get(j) < target) ans++;
            }
        }
        return ans;
    }
}