package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(romanToInt("MCMXCIV"));
  }

  public static int romanToInt(String s) {
    Map<String, Integer> map = new HashMap<>();
    init(map);
    int res = 0;
    int offset = 0;
    int len = 4;
    while (offset < s.length()) {
      if (len > s.length() - offset) {
        len = s.length() - offset;
      }
      String substring = s.substring(offset, len + offset);
      if (map.containsKey(substring)) {
        res += map.get(substring);
        offset = offset + len;
        len = 4;
      } else {
        len--;
      }
    }
    return res;
  }

  public static void init(Map<String, Integer> map) {
    map.put("I", 1);
    map.put("II", 2);
    map.put("III", 3);
    map.put("IV", 4);
    map.put("V", 5);
    map.put("VI", 6);
    map.put("VII", 7);
    map.put("VIII", 8);
    map.put("IX", 9);
    map.put("X", 10);
    map.put("XX", 20);
    map.put("XXX", 30);
    map.put("XL", 40);
    map.put("L", 50);
    map.put("LX", 60);
    map.put("LXX", 70);
    map.put("LXXX", 80);
    map.put("XC", 90);
    map.put("C", 100);
    map.put("CC", 200);
    map.put("CCC", 300);
    map.put("CD", 400);
    map.put("D", 500);
    map.put("DC", 600);
    map.put("DCC", 700);
    map.put("DCCC", 800);
    map.put("CM", 900);
    map.put("M", 1000);
    map.put("MM", 2000);
    map.put("MMM", 3000);
  }

}
