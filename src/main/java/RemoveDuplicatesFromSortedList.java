public class RemoveDuplicatesFromSortedList {
    public static Node removeDuplicates(Node head) {
        Node p = head;
        Node q;
        while(p!=null && p.next!=null){
            if(p.val == p.next.val){
                q=p.next.next;
                if(q==null){
                    p.next=null;
                    break;
                }
                p.next=q;
            }
            if(p.val!=p.next.val){
                p=p.next;
            }

        }
        return head;
    }

}
