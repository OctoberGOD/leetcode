# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        front=head
        newtail=head
        index=1
        if head==None or k==0:
            return head
        while(front.next!=None and index<k):
            front=front.next
            index+=1
        if(front.next==None and index==k):
            return head
        elif(front.next!=None and index==k):
            front=front.next
            while(front.next!=None):
                front=front.next
                newtail=newtail.next
            newhead=newtail.next
            front.next=head
            newtail.next=None
        else:
            shift=k%index
            print(shift)
            if shift==0:
                return head
            else:
                for i in range(index-shift-1):
                    newtail=newtail.next
                newhead=newtail.next
                front.next=head
                newtail.next=None
            
        return newhead
