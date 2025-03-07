/**
*   question : 2011. Final Value of Variable After Performing Operations
*/

import java.util.Arrays;

public class FinalValue{
    public static void main(String[] args){
        System.out.print(finalValueAfterOperations(new String[]{"++X","++X","X++"}));
    }

    static public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String operation:operations){
            if(operation.equals("X++") || operation.equals("++X"))
                ans++;
            else
                ans--;
        }
        return ans;
    }
}
