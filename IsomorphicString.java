/**
*   question : 205. Isomorphic Strings
*/

import java.util.*;

public class IsomorphicString{
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
    static public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (sMap.containsKey(ch1) && sMap.get(ch1) != ch2) {
                return false;
            }
            if (tMap.containsKey(ch2) && tMap.get(ch2) != ch1) {
                return false;
            }
            sMap.put(ch1, ch2);
            tMap.put(ch2, ch1);
        }
        return true;
    }
}