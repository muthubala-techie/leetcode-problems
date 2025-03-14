/**
*   qustion : 852. Peak Index in a Mountain Array
*/

public class PeakIndex{
    public static void main(String[] args){
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0}));
    }
    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]) end = mid;
            else start = mid+1;
        }
        return start;
    }
}