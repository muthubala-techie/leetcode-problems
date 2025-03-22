/**
*   question : 1769. Minimum Number of Operations to Move All Balls to Each Box
*/


import java.util.Arrays;
public class MinNoOfOperation{
    public static void main(String[] args){
        System.out.print(minOperations("110"));
    }
    static public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        int count = 0, ops = 0;
        for (int i = 0; i < n; i++) {
            answer[i] = ops;
            if (boxes.charAt(i) == '1') {
                count++;
            }
            ops += count;
        }
        count = 0;
        ops = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += ops;
            if (boxes.charAt(i) == '1') {
                count++;
            }
            ops += count;
        }
        return answer;
    }
}