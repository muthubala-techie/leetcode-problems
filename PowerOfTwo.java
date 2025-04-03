/**
*   question : 231. Power of Two
*/

public class PowerOfTwo{
    public static void main(String[] args){
        System.out.print(isPowerOfTwo(4));
    }
    static public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}