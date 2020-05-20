import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {
    public static Node reverse(Node<Integer> head){
        Stack<Node> stack = new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        Node<Integer>dummyHead=stack.pop();
        Node<Integer> temp = dummyHead;
        while (!stack.isEmpty()){
            temp.next=stack.pop();
            temp = temp.next;
        }
        temp.next=null;
        return dummyHead;
    }

}
