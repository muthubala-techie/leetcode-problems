/**
*   qustion : 69. Sqrt(x)
*/

public class Squrt{
    public static void main(String[] args){
        System.out.print(mySqrt(4));
    }
    static public int mySqrt(int x) {
        if (x == 0 || x == 1) return x; 
        int left = 1, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (mid <= x / mid) { 
                ans = mid; 
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return ans;
    }
}