/**
*   question : 2942. Find Words Containing Character
*/
import java.util.ArrayList;
import java.util.List;

public class FindWords{
    public static void main(String[] args){
        List ans = findWordsContaining(new String[] {"abc","bcd","aaaa","cbc"},'z');
        System.out.println(ans.toString());
    }

    static public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j) == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}