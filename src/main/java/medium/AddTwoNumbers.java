package medium;

public class AddTwoNumbers {

  public static void main(String[] args) {

    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(4, listNode1);
    ListNode listNode3 = new ListNode(9, listNode2);
//    ListNode listNode3 = new ListNode(1);

    ListNode lN1 = new ListNode(5);
    ListNode lN2 = new ListNode(6, lN1);
    ListNode lN3 = new ListNode(4, lN2);
//    ListNode lN3 = new ListNode(4);
    addTwoNumbers(listNode3, lN3);
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int remainder = 0;
    ListNode listNode1 = l1;
    ListNode listNode2 = l2;
    ListNode first = null;
    ListNode lastValue = null;
    while (listNode1 != null || listNode2 != null || remainder != 0) {
      int result = 0;
      System.out.println(listNode1.val + " + " + listNode2.val + " + " + remainder);
      if (listNode1 != null && listNode2 != null) {
        result = listNode1.val + listNode2.val + remainder;
        listNode1 = listNode1.next;
        listNode2 = listNode2.next;
      } else if (listNode2 != null) {
        result = listNode2.val + remainder;
        listNode2 = listNode2.next;
      } else if (listNode1 != null) {
        result = listNode1.val + remainder;
        listNode1 = listNode1.next;
      } else if (remainder != 0) {
        result = remainder;
        remainder = 0;
      }
      if (result / 10 != 0) {
        remainder = result / 10;
        result = result % 10;
      } else {
        remainder = 0;
      }
      ListNode node = new ListNode(result, null);
      if (lastValue != null) {
        lastValue.next = node;
      }else {
        first = node;
      }
      lastValue = node;
    }
    return first;
  }


  public static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

}
