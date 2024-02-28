package medium;

public class LongestPalindromicSubstring {

  public static void main(String[] args) {
    //System.out.println("Result: " + longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
    System.out.println("Result: " + longestPalindrome("abb"));
  }

  public static String longestPalindrome(String s) {
    if (s.isBlank()) {
      return s;
    }
    StringBuilder str = new StringBuilder(s);
    StringBuilder reverse = new StringBuilder(s).reverse();
    if (str.compareTo(reverse) == 0) {
      return s;
    }
    String palindrome = String.valueOf(s.charAt(0));
    for (int j = s.length() - 1; 0 <= j; j--) {
      if (palindrome.length() >= j) {
        break;
      }
      str.deleteCharAt(j);
      reverse.deleteCharAt(j);
      for (int k = 0; k < s.length() / 2; k++) {
        if (palindrome.length() >= (str.length() - k)) {
          break;
        }
        if (isNewPalindrome(str.substring(k), palindrome)) {
          palindrome = str.substring(k);
          break;
        } else if (isNewPalindrome(reverse.substring(k), palindrome)) {
          palindrome = reverse.substring(k);
          break;
        }
      }
    }
    return palindrome;
  }

  public static boolean isNewPalindrome(String str, String palindrome) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return palindrome.length() < str.length();
  }
}
