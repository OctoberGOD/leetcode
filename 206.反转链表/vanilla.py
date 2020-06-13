if not head or not head.next:
            return head
        
        back=head
        front=head.next
        back.next=None
        while(front):
            print(front.val)
            temp=front
            front=front.next
            temp.next=back
            back=temp
            
        return back
        
        
        
