/**
*   qustion : 125. Valid Palindrome
*/

public class ValidPalindrome{
    public static void main(String[] args){
        System.out.print(isPalindrome("0P"));
    }
    // worst solution
    static public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        String ans = "";
        for(int i=s.length()-1;i>=0;i--) ans+=s.charAt(i);
        return ans.equals(s);
    }
}