package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagConversion {

  public static void main(String[] args) {
//    String pahnaplsiigyir = "PRAIIYHNPSGAIL";
//    String paypalishiring = convert("PAYPALISHIRING", 6);
//    String pahnaplsiigyir = "PHASIYIRPLIGAN";
//    String paypalishiring = convert("PAYPALISHIRING", 5);
    String pahnaplsiigyir = "PAHNAPLSIIGYIR";
    String paypalishiring = convert("PAYPALISHIRING", 3);
    System.out.println(paypalishiring);
    System.out.println(pahnaplsiigyir.equals(paypalishiring));
  }

  public static String convert(String s, int numRows) {
    if (s.length() <= 1 || numRows == 1) {
      return s;
    }
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      int count = (numRows - i) * 2 - 2 <= 0 ? numRows * 2 - 2 : (numRows - i) * 2 - 2;
      for (int j = i, z = 1; j < s.length(); z++) {
        if (count != numRows * 2 - 2) {
          str.append(s.charAt(j));
          if (z % 2 != 0) {
            j += count;
          } else {
            j = j + (i * 2);
          }
        } else {
          str.append(s.charAt(j));
          j += count;
        }
      }
    }
    return str.toString();
  }
}
