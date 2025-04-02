/**
*   question : 3461. Check If Digits Are Equal in String After Operations I
*/

public class CheckEqual{
    public static void main(String[] args){
        System.out.print(hasSameDigits("3902"));
    }
    static public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder newS = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int sum = (s.charAt(i) - '0') + (s.charAt(i + 1) - '0');
                newS.append(sum % 10);
            }
            s = newS.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}