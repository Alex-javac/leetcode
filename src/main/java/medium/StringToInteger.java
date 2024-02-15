package medium;

public class StringToInteger {

  public static void main(String[] args) {
    String s = "-42";

    System.out.println(myAtoi(s));
  }

  public static int myAtoi(String s) {
    if (s.isBlank()) {
      return 0;
    }
    s = s.trim();
    StringBuilder str = new StringBuilder();
    char c = s.charAt(0);
    if (c == '-' || c == '+') {
      str.append(c);
    }
    for (int i = str.length(); i < s.length(); i++) {
      if (Character.toString(s.charAt(i)).matches("\\D")) {
        break;
      } else {
        str.append(s.charAt(i));
      }
    }
    try {
      return Integer.parseInt(str.toString());
    } catch (NumberFormatException exception) {
      if (str.length() <= 1) {
        return 0;
      }
      return str.toString().charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }
  }
}
