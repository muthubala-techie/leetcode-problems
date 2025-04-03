/**
*   question : 58. Add Digits
*/

public class AddDigits{
    public static void main(String[] args){
        System.out.print(addDigits(38));
    }
    static public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}