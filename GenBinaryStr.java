/**
*   question : 3211. Generate Binary Strings Without Adjacent Zeros
*/

import java.util.*;
public class GenBinaryStr{
    public static void main(String[] args){
        System.out.print(validStrings(3));
    }
    static public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generate(n, "", result);
        return result;
    }
    static public void generate(int n, String current, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        generate(n, current + "1", result);
        if (current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            generate(n, current + "0", result);
        }
    }
}