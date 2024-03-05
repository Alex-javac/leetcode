package medium;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

  public static void main(String[] args) {
    System.out.println(intToRoman(10));
  }

  public static String intToRoman(int num) {
    Map<Integer, String> map = new HashMap<>();
    init(map);
    StringBuilder res = new StringBuilder();
    int level = 1;
    while (num > 0) {
      res.append(map.get((num % 10) * level));
      num = num / 10;
      level = level * 10;
    }
    return res.reverse().toString();
  }

  public static Map<Integer, String> map = new HashMap<>();

  static void init(Map<Integer, String> map) {
    map.put(0, "");
    map.put(1, "I");
    map.put(2, "II");
    map.put(3, "III");
    map.put(4, "VI");
    map.put(5, "V");
    map.put(6, "IV");
    map.put(7, "IIV");
    map.put(8, "IIIV");
    map.put(9, "XI");
    map.put(10, "X");
    map.put(20, "XX");
    map.put(30, "XXX");
    map.put(40, "LX");
    map.put(50, "L");
    map.put(60, "XL");
    map.put(70, "XXL");
    map.put(80, "XXXL");
    map.put(90, "CX");
    map.put(100, "C");
    map.put(200, "CC");
    map.put(300, "CCC");
    map.put(400, "DC");
    map.put(500, "D");
    map.put(600, "CD");
    map.put(700, "CCD");
    map.put(800, "CCCD");
    map.put(900, "MC");
    map.put(1000, "M");
    map.put(2000, "MM");
    map.put(3000, "MM");
}
}
