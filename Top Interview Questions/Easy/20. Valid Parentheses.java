class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list3 = new ListNode(-1);
        ListNode head = list3;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                list3.next=l1;
                l1=l1.next;
            }  else{
                list3.next =l2;
                l2=l2.next;
            }
            list3 = list3.next;
        }

        if (l1 != null){
            list3.next = l1;
        } else{
            list3.next = l2;
        }
        return head.next;
}
}