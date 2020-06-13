class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return head
        newhead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return newhead


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        def help(pre, cur)
            if cur == None:
                return pre
            else
                nextNode = cur.next
                cur.next = pre
                return reverse(cur, nextNode)
        return help(None, head)

