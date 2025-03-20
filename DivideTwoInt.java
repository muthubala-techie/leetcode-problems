/**
*   question : 29. Divide Two Integers
*/


public class DivideTwoInt{
    public static void main(String[] args){
        System.out.print(divide(10,3));
    }
    static public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}