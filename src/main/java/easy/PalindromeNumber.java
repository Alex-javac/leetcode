package easy;

public class PalindromeNumber {

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }

  public static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int z = x, i = 0;
    while (z > 0) {
      i = i * 10 + z % 10;
      z /= 10;
    }
    return x == i;
  }
}
