/**
*   question : 27. Remove Element
*/


public class RemoveElement{
    public static void main(String[] args){
        System.out.println(removeElement(new int[]{3,2,2,3} , 3));
    }
    static public int removeElement(int[] nums, int val) {
        int k = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++;
            }
        }
        return k; 
    }
}