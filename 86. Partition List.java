class Solution {
    public ListNode partition(ListNode head, int x) {
        // sxlist--> listnode which link the all smaller node than x
        // bxlist--> listnode which link the equal and bigger than node x
        ListNode sxlist=new ListNode();
        ListNode bxlist=new ListNode(); 

        ListNode temp=head;  // temp point to head of the list 
        ListNode small=sxlist; // small point to sxlist
        ListNode big=bxlist;  // big point to bxlist

        // traverse through the list and add all the smaller node than x to sxlist and bigger or equal to bxlist
        while(temp!=null){   
            if(temp.val<x){
                small.next=temp;
                small=small.next;
            }else{
                big.next=temp;
                big=big.next;
            }
            temp=temp.next;
        }

        // join the sxlist and bxlist, as small is now pointing to last node of the sxlist and big is pointing to the last node, so to join both list make small.next=bx.list and big.next=null  
        small.next=bxlist.next;
        big.next=null;

        return sxlist.next;
        
    }
}