/**
*   question : 13. Roman to Integer
*/


import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {  
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;  
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));    
        System.out.println(romanToInt("LVIII"));    
        System.out.println(romanToInt("MCMXCIV"));  
    }
}
