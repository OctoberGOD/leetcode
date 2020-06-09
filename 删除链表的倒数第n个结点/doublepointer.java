/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode front=head;
        ListNode delete=head;
        for(int i=0;i<n;i++){
            front=front.next;
        }
        if (front == null){
            return head.next;
        }
        while (front.next !=null){
            front=front.next;
            delete=delete.next;
        }
        delete.next=delete.next.next;
        return head;

    }
}

// public class Solution {

//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode first = dummy;
//         ListNode second = dummy;

//         for (int i = 1; i <= n + 1; i++) {
//             first = first.next;
//         }

//         while (first != null) {
//             first = first.next;
//             second = second.next;
//         }
//         second.next = second.next.next;
//         return dummy.next;
//     }
// }
