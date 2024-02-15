package medium;

public class ReverseInteger {

  public static void main(String[] args) {
//    int x = 1534236469;
//    long expected = 0;
//    int actual = reverse(x);

//    int x = 123;
//    long expected = 321;
//    int actual = reverse(x);
    int x = -123;
    long expected = -321;
    int actual = reverse(x);
    System.out.println("expected :" + expected);
    System.out.println("actual :" + actual);
    System.out.println(expected == actual);
  }

  public static int reverse(int x) {
    int num = x;
    if (x < 0) {
      num = -x;
    }
    long result = 0;
    while (num > 0) {
      result = result * 10 + num % 10;
      num = num / 10;
    }
    if (result > Integer.MAX_VALUE) {
      return 0;
    }
    return x < 0 ? (int) -result : (int) result;
  }
}
