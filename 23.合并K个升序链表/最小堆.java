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

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue = new PriorityQueue<>((v1,v2)->v1.val-v2.val);
        for(ListNode node : lists) {
            if(node!=null) {
                queue.offer(node);
            }
        }
        ListNode head = new ListNode();
        ListNode tail = head;
        while(!queue.isEmpty()) {
            ListNode minNode = queue.poll();
            tail.next = minNode;
            tail = minNode;
            if(minNode.next!=null) {
                queue.offer(minNode.next);
            }
        }
        return head.next;
    }
}
