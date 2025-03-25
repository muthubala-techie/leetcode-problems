/**
*   question : 171. Excel Sheet Column Number
*/

public class ColumnNum{
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }
    static public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char ch : columnTitle.toCharArray()) {
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}