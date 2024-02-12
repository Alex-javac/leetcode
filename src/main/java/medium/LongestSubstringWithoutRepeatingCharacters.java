package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("bziuwnklhqzrxnb"));
  }

  public static int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    if (s.length() == 1) {
      return 1;
    }
    Map<Integer, Set<Character>> map = new HashMap<>();
    int maxCount = 0;
    for (int i = 0; i < s.length(); i++) {
      List<Integer> list = new ArrayList<>();
      for (Map.Entry<Integer, Set<Character>> entry : map.entrySet()) {
        Set<Character> value = entry.getValue();
        if (!value.contains(s.charAt(i))) {
          value.add(s.charAt(i));
        } else {
          list.add(entry.getKey());
        }
        if (maxCount < value.size()) {
          maxCount = value.size();
        }
      }
      if (maxCount < (s.length() - i)) {
        map.put(i, new HashSet<>(List.of(s.charAt(i))));
      }
      list.forEach(map::remove);
    }
    return maxCount;
  }
}
