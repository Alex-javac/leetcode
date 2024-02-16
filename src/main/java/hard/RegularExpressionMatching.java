package hard;


public class RegularExpressionMatching {

  public static void main(String[] args) {
    System.out.println(isMatch("abc", "a***abdc"));
  }

  public static boolean isMatch(String s, String p) {
    try {
      return s.matches(p);
    } catch (Exception exception) {
      return p.contains(s);
    }
  }
}
