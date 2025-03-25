/**
*   question : 168. Excel Sheet Column Title
*/

public class ColumnTittle{
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
    static public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; 
            char letter = (char) ('A' + (columnNumber % 26));
            result.append(letter);
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}