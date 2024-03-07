package easy;

public class LongestCommonPrefix {

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
  }

  public static String longestCommonPrefix(String[] strs) {
    if (strs[0].isBlank()) {
      return strs[0];
    }
    StringBuilder res = new StringBuilder();
    char lastchar;
    for (int x = 0; x < strs[0].length(); x++) {
      lastchar = strs[0].charAt(x);
      for (int i = 1; i < strs.length; i++) {
        if (strs[i].isBlank() || strs[i].length() <= x || strs[i].charAt(x) != lastchar) {
          return res.toString();
        }
      }
      res.append(lastchar);
    }
    return res.toString();
  }
}
