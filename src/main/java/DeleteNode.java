
public class DeleteNode {
    public static void deleteNode(Node node){
            node.val=node.next.val;
            node.next=node.next.next;
        }

}
