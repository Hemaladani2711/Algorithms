public class LL<T> {
    Node head;

    public LL() {
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node();
            head.val = data;
            head.next = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node();
            newNode.val = data;
            newNode.next = null;
            temp.next = newNode;
        }
    }

    public Node getNode(T data){
        Node temp = head;
        while(temp!=null){
            if(temp.val==data){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public boolean deleteNode(T data){
        Node temp = head;
        if (head.val == data) {
            head = head.next;
        } else {
            while (temp != null) {
                if (temp.next.val == data) {
                    temp.next = temp.next.next;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public void printAll() {
        System.out.println("Below is the list");
        Node temp = head;
        while (temp != null) {
            System.out.println("" + temp.val);
            temp = temp.next;
        }
    }
    public void printAll(Node<T> head){
        while(head!=null){
            System.out.println(""+head.val);
            head = head.next;
        }

    }
    public Node<Integer> mergeSortedLists(Node<Integer> l1, Node <Integer> l2){
        System.out.println("Merged List");
        Node<Integer> dummyHead = new Node<>();
        dummyHead.val=0;
        dummyHead.next=null;
        Node<Integer> temp = dummyHead;
        while (l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp.next=l1;
                l1=l1.next;
            }else{
                temp.next = l2;
                l2=l2.next;

            }
            temp = temp.next;
        }

        temp.next = l1 != null?l1:l2;
        return dummyHead.next;
    }

}
