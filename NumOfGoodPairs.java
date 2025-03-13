/**
*   qustion : 3162. Find the Number of Good Pairs I
*/

public class NumOfGoodPairs{
    public static void main(String[] args){
        System.out.print(numberOfPairs(new int[]{1,3,4},new int[]{1,3,4} , 1));
    }
    static public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int ans = 0;
        for(int num1:nums1){
            for(int num2:nums2){
                if(num1 % (num2*k) == 0) ans++;
            }
        }
        return ans;
    }
}