/**
*   qustion : 1359. Count All Valid Pickup and Delivery Options
*/


public class ValidPickup{
    public static void main(String[] args){
        System.out.print(countOrders(2));
    }
    static public int countOrders(int n) {
        long MOD = 1_000_000_007;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * (2 * i - 1) * i) % MOD;
        }
        return (int) result;
    }
}