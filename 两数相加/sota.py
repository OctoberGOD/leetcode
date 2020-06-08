#执行用时 :56 ms, 在所有 Python 提交中击败了98.12%的用户
#内存消耗 :13 MB, 在所有 Python 提交中击败了5.55%的用户

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        re = ListNode(0)
        r=re
        carry=0
        while(l1 or l2):
            x= l1.val if l1 else 0
            y= l2.val if l2 else 0
            s=carry+x+y
            carry=s//10
            # print(s,carry)
            r.next=ListNode(s%10)
            r=r.next
            if(l1!=None):l1=l1.next
            if(l2!=None):l2=l2.next
        if(carry>0):
            r.next=ListNode(1)
        return re.next
