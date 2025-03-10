/**
*   question : 1684. Count the Number of Consistent Strings
*/

public class CountNum{
    public static void main(String[] args){
        System.out.println(countConsistentStrings("abc",new String[] {"a","b","c","ab","ac","bc","abc"}));
    }

    // this is worst solution
    static public int countConsistentStrings(String allowed, String[] words) {
        int ans = words.length;
        for(String word:words){
            if(isNotAllowed(allowed,word)){
                ans--;
            }
        }
        return ans;
    }
    static public boolean isNotAllowed(String allowed,String word){
        boolean isNotAllowed = false;

        for(int i=0;i<word.length();i++){
            if(allowed.indexOf(word.charAt(i)) == -1){
                isNotAllowed = true;
                break;
            }
        }
        return isNotAllowed;
    }
}