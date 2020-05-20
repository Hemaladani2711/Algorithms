public class MergeLists {
    public static Node mergeLists(Node <Integer>l1, Node<Integer> l2){
        Node dummyHead = new Node();
        if(l1.val<l2.val){
            dummyHead.val = l1.val;
        }else{
            dummyHead.val=l2.val;
        }
        Node temp = dummyHead;
        temp = temp.next;
        while(l1!=null && l2 !=null){
            if(l1.val<=l2.val){
                temp.val=l1.val;
                l1=l1.next;
            }else{
                temp.val=l2.val;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null){
            temp.next=l1;
        }else{
            temp.next=l2;
        }
        return dummyHead;

    }
}
