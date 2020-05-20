import java.util.List;

public class LinkedList {

    ListNode<Integer> head;
    public LinkedList(){
        head = new ListNode<Integer>(0);
        head.next = null;
    }
    public LinkedList(int data){
         head = new ListNode<Integer>(data);
         head.next = null;
    }
    public boolean searchList(int key){
        ListNode<Integer> temp = head;

        while( temp!=null && temp.data!=key){
            System.out.println("Data: "+temp.data);
            temp=temp.next;
        }

        /*while( temp!=null){
            if(temp.data==key)break;
            temp=temp.next;
        }
*/
        return temp!=null?true:false;
    }
    public ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> node1,ListNode<Integer> node2){
        ListNode<Integer> temp1 = node1;
        ListNode<Integer> head2 = node1;
        temp1 = head2.next;
        node1 = node2.next;
        while(node1!=null){
            temp1 = node1;
            temp1 = temp1.next;
            node1 = node1.next;
        }
        while (node2 != null){
            temp1 = node2;
            temp1 = temp1.next;
            node2 = node2.next;
        }
        return head2;
    }
    public void insertAfter(ListNode<Integer> node, ListNode<Integer> newNode){
        newNode.next = node.next;
        node.next = newNode;
    }
    //delete the node following Node
    public void deleteNode(ListNode<Integer> node){
        node.next = node.next.next;
    }

    public void add(int data){
        ListNode<Integer> temp = head;
        ListNode<Integer> newNode = new ListNode<Integer>(data);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public ListNode<Integer> getHead(){
        return head;
    }
    public void printList(ListNode<Integer> head){
        ListNode<Integer> temp = head.next;
        while (temp!=null){
            System.out.println(""+temp.data);
            temp = temp.next;
        }
    }


}
class ListNode<T>{
    public T data;
    public ListNode<T> next;
    public ListNode(T data){
        this.data = data;
        this.next = null;
    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }
    public ListNode getNext(){
        return next;
    }
    public void setNext(ListNode<T> next){
        this.next = next;
    }
}
