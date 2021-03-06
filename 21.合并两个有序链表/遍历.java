/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode temp = res;
        while(l1!=null && l2!=null) {
            while(l2!=null&&l1!=null&&l1.val>=l2.val  ) {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
            while(l2!=null&&l1!=null&&l1.val<=l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
        }
        if(l1==null) {
            while (l2!=null) {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        if(l2 == null) {
            while (l1 != null) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
        }
        return res.next;
    }
    
}
