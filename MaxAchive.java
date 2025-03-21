/**
*   question : 2769. Find the Maximum Achievable Number
*/

public class MaxAchive{
    public static void main(String[] args){
        System.out.print(theMaximumAchievableX(4,1));
    }
    static public int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }
}