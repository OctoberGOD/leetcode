# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
import math

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        a=0;
        b=0;
        result=ListNode()
        if l1.next is None:
            a=l1.val
        else:
            count=1
            while l1 is not None:
                a+=l1.val*count
                # print("l1.val:",l1.val,"a=:",a)
                l1=l1.next
                count*=10
        
        if l2.next is None:
            b=l2.val
        else:
            count=1
            while l2 is not None:
                b+=l2.val*count
                l2=l2.next
                count*=10

        print(a,b,a+b)
       
        sum=a+b
        if sum==0:
            result.val=0
            return result
        else:
            result1=result
            while sum!=0:
                temp=ListNode(sum%10)
                sum/=10
                result1.next=temp
                temp.next=None
                result1=temp
            return result.next

