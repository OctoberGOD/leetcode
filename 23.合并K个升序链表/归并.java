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

    public ListNode mergeTwoLists(ListNode a,ListNode b) {
        if(a==null||b==null) return a==null?b:a;
        ListNode head=new ListNode();
        ListNode tail = head;
        while(a!=null&&b!=null) {
            if(a.val>b.val) {
                tail.next = b;
                b = b.next;
            } else{
                tail.next = a;
                a = a.next;
            }
            tail = tail.next;
        }
        //a==null?tail.next=b:tail.next=a;
        tail.next = (a==null)?b:a;
        return head.next;
    }

    ListNode merge(ListNode[] lists, int l,int r){
        if(l==r) return lists[l];
        if(l>r) return null;
        int mid = (l+r)/2;
        return mergeTwoLists(merge(lists,l,mid),merge(lists,mid+1,r));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists,0,lists.length-1);
    }
}
