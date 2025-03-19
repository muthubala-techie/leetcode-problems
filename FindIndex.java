/**
*   question : 28. Find the Index of the First Occurrence in a String
*/


public class FindIndex{
    public static void main(String[] args){
        System.out.print(strStr("sadbutsad","sad"));
    }
    static public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}