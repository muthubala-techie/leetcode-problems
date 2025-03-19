/**
*   question : 14. Longest Common Prefix
*/

public class CommanPrefix{
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {  
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(words1)); 
        String[] words2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(words2));
        String[] words3 = {"interview", "internet", "internal"};
        System.out.println(longestCommonPrefix(words3));
    }
}