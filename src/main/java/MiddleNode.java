import java.util.*;

public class MiddleNode {
    public static Node middleN(Node<Integer> head){
        Node<Integer> temp = head;
        Set<Integer> list= new HashSet<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int middle = list.size()/2;
        int i = 0;
        while( i<middle){
            head=head.next;
            i++;
        }
        return head;
    }
}
