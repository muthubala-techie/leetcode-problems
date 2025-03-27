/**
*   question : 136. Single Number 
*/

public class SingleNumber{
    public static void main(String[] args){
        System.out.print(singleNumber(new int[]{2,2,1}));
    }
    static public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  
        }
        return result;
    }
}