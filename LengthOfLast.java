/**
*   question : 58. Length of Last Word
*/

public class LengthOfLast{
    public static void main(String[] args){
        System.out.print(lengthOfLastWord("hello world"));
    }
    static public int lengthOfLastWord(String s) {
        String[] ans = s.split(" ");
        return ans[ans.length-1].length();
    }
}