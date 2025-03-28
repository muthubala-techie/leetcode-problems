/**
*   question : 2433. Find The Original Array of Prefix Xor
*/


import java.util.Arrays;
public class FindPrefix{
    public static void main(String[] args){
        System.out.print(Arrays.toString(findArray(new int[]{5,2,0,3,1})));
    }
    static public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] arr = new int[n];
        arr[0] = pref[0]; 
        for (int i = 1; i < n; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        return arr;
    }
}