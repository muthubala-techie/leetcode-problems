/**
*   qustion : 744. Find Smallest Letter Greater Than Target
*/

public class FindSmallestLetter{
    public static void main(String[] args){
        System.out.print(nextGreatestLetter(new char[]{'c','f','j'} , 'd'));
    }
    static public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target < letters[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return letters[start % letters.length];
    }
}