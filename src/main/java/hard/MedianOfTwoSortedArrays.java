package hard;

public class MedianOfTwoSortedArrays {

  public static void main(String[] args) {
    int[] nums1 = {1, 3};
    int[] nums2 = {2, 4};
    System.out.println(findMedianSortedArrays(nums1, nums2));
  }

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] array = new int[nums1.length + nums2.length];
    for (int i = array.length - 1, i1 = nums1.length - 1, i2 = nums2.length - 1; i >= 0; i--) {
      if (i1 >= 0 && i2 >= 0 && nums1[i1] > nums2[i2]) {
        array[i] = nums1[i1];
        i1--;
      } else if (i2 < 0) {
        array[i] = nums1[i1];
        i1--;
      } else if (i1 < 0) {
        array[i] = nums2[i2];
        i2--;
      } else {
        array[i] = nums2[i2];
        i2--;
      }
    }
    return array.length % 2 == 0 ?
        (double) ((array[(array.length - 1) / 2]) + (array[(array.length + 1) / 2])) / 2
        : array[(array.length - 1) / 2];
  }
}
