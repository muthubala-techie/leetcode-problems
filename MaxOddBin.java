/**
*   question : 2864. Maximum Odd Binary Number
*/

public class MaxOddBin{
    public static void main(String[] args){
        System.out.print(maximumOddBinaryNumber("010"));
    }
    static public String maximumOddBinaryNumber(String s) {
         int ones = 0, zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
            else zeros++;
        }
        StringBuilder result = new StringBuilder();
        result.append("1".repeat(ones - 1)); 
        result.append("0".repeat(zeros));    
        result.append("1");                 
        return result.toString();
    }
}