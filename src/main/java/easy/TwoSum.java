package easy;

public class TwoSum {

  public static void main(String[] args) {
    int[] arr = new int[]{0, 3, -3, 4, -1};
    int[] twoSum = twoSum(arr, -1);
    System.out.println("[" + twoSum[0] + "," + twoSum[1] + "]");
  }

  public static int[] twoSum(int[] nums, int target) {
    int searchValue;
    for (int i = 0; i < nums.length; i++) {
      searchValue = target - nums[i];
      for (int j = 0; j < nums.length; j++) {
        if (searchValue == nums[j] && j != i) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }
}
