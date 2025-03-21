/**
*   question : 2469. Convert the Temperature
*/

public class SumsDiff{
    public static void main(String[] args){
        System.out.print(differenceOfSums(10,3));
    }
    static public int differenceOfSums(int n, int m) {
        int totalSum = (n * (n + 1)) / 2;
        int k = n / m;
        int divisibleSum = m * (k * (k + 1)) / 2;
        return totalSum - 2 * divisibleSum;
    }
}