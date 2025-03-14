/**
*   qustion : 162. Find Peak Element
*/

public class FindPeak{
    public static void main(String[] args){
        System.out.print(findPeakElement(new int[]{1,2,3,1}));
    }
    static public int findPeakElement(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]) end = mid;
            else start = mid+1;
        }
        return start;
    }
}