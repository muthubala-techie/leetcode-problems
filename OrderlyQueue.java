/**
*   qustion : 899. Orderly Queue
*/

import java.util.Arrays;
public class OrderlyQueue{
    public static void main(String[] args){
        System.out.print(orderlyQueue("cba",1));
    }
    static public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String smallest = s;
            StringBuilder sb = new StringBuilder(s);
            int n = s.length();
            for (int i = 1; i < n; i++) {
                sb.append(sb.charAt(0));
                sb.deleteCharAt(0);
                String rotated = sb.toString();
                if (rotated.compareTo(smallest) < 0) {
                    smallest = rotated;
                }
            }
            return smallest;
        } else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
}