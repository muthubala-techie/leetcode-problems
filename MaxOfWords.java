/**
*   qustion : 2114. Maximum Number of Words Found in Sentences
*/

public class MaxOfWords{
    public static void main(String[] args){
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }
    static public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String word:sentences){
            String[] arr = word.split(" ");
            max = arr.length>max ? arr.length : max;
        }
        return max;
    }
}