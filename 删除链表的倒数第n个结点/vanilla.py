# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        start=ListNode(0)
        start.next=head
        mark=[]
        this=start 
        while this is not None:
            mark.append(this)
            this=this.next
        this=mark[-n]
        print('this.val: ',this.val)
        n+=1
        prior=mark[-n]
        print('prior.val: ',prior.val)
        prior.next=this.next
        del this
        return mark[0].next
    
