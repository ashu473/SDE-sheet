class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if(head.next==null){
            return null;
        }
        //size of the linked list
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int IndexToSearch=size-n;
        ListNode prev=head;
        int i=1;
        while(i<IndexToSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}