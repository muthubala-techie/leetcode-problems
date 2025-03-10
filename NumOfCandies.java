/**
*   question : 1431. Kids With the Greatest Number of Candies
*/

import java.util.List;
import java.util.ArrayList;

public class NumOfCandies{
    public static void main(String[] args){
        List<Boolean> ans = kidsWithCandies(new int[]{2,3,5,1,3} , 3);
        System.out.print(ans.toString());
    }
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for(int candie:candies){
            int sum = candie + extraCandies;
            boolean isBig = true;
            for(int checkcandie:candies){
                if(sum < checkcandie){
                    isBig = false;
                    ans.add(false);
                    break;
                }
            }
            if(isBig) ans.add(true);
        }
        return ans;
    }
}