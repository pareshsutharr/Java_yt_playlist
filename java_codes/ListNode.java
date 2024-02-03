
//  //Definition for singly-linked list.
//   public class ListNode{
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
 
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode l3 = new ListNode();
//         for (int i = 0; i < 10; i++) {
//             System.out.println(i);
//         }
//         System.out.println("hello world");
//         return l1;
//     }
// }
public class ListNode {
    public static void main(String[] args) {
        ListNode lt = new ListNode();
        lt.lengthOfLongestSubstring("hello");
    }
    int count = 0;
    int temp ;
    public int lengthOfLongestSubstring(String s) {
    for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(i) != s.charAt(j)) {
                count++;
            }
        }
    }
    temp = count/s.length()-1;
    System.out.println(temp);
    return temp;
    }
}