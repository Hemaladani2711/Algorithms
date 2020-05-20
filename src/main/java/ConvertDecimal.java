import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ConvertDecimal {

    public static int getDecimal(Node<Integer> head){
        int total=0,j;
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        j=list.size()-1;
        for(int i=0;i<list.size();i++){
            total+=list.get(i)*Math.pow(2,j--);
        }
        return total;
    }
}
