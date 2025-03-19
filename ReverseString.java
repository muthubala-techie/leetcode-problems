/**
*   question : 344. Reverse String
*/


public class ReverseString{
    public static void main(String[] args){
        char[] ans = new char[] {'h','e','l','l','o'};
        reverseString(ans);
        System.out.print(ans);
    }
    static public void reverseString(char[] s) {
        int start=0, end=s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }   
}