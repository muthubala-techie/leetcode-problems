/**
*   question : 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
*/

public class PartitioningNum{
    public static void main(String[] args){
        System.out.print(minPartitions("32"));
    }
    static public int minPartitions(String n) {
        int maxDigit = 0;
        for (char c : n.toCharArray()) {
            maxDigit = Math.max(maxDigit, c - '0');
        }
        return maxDigit;
    }
}