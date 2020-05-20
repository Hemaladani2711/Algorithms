import java.util.ArrayList;
import java.util.List;

public class LinkedListIsPalindrome {
    public static boolean isPalindrome(Node<Integer> node){
        List<Integer> list = new ArrayList<>();
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        if(list.size()==0 || list.size()==1){
            return true;
        }
        for(int i=0,j=list.size()-1;i<j;i++,j--){
            if(list.get(i)!=list.get(j)){
                return false;
            }
        }
        return true;
    }
}
