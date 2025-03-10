/**
*   question : 2798. Number of Employees Who Met the Target
*/

public class MetTheTarget{
    public static void main(String[] args){
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{5,1,4,2,2} , 6));
    }
    static public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for(int hour:hours){
            if(hour >= target) ans++;
        }
        return ans;
    }
}