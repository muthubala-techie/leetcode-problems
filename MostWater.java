/**
*   question : 11. Container With Most Water
*/

public class MostWater{
    public static void main(String[] args){
        System.out.print(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    static public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = minHeight * width;
            maxWater = Math.max(maxWater, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}