package medium;

public class ContainerWithMostWater {

  public static void main(String[] args) {
//    int[] height = new int[]{4,3,2,1,4};
    int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
//    int[] height = new int[]{2,3,4,5,18,17,6};
    System.out.println(maxArea(height));
  }

  public static int maxArea(int[] height) {
    int maxValue = 0, left = 0, right = height.length - 1, y;
    while (left < right) {
      y = ((height[left] <= height[right]) ? height[left] : height[right]) * (right - left);
      if (maxValue < y) {
        maxValue = y;
      }
      if (height[left] > height[right]) {
        right--;
      } else {
        left++;
      }
    }
    return maxValue;
  }
}
