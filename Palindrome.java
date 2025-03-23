/**
*   qustion : 9. Palindrome Number
*/

public class Palindrome{
    public static void main(String[] args){
        System.out.print(isPalindrome(121));
    }
    static public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x , ans = 0;
        while(temp>0){
            int rem = temp % 10;
            ans = (ans * 10) + rem;
            temp = temp / 10;
        }
        return ans == x;
    }
}