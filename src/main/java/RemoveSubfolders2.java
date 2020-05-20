import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RemoveSubfolders2 {
    public static List<String> removeSubfolder(String[] folders){
       // List<String> subfolder = new ArrayList<>();
        Arrays.sort(folders);
        Stack<String> stack = new Stack<>();
        stack.push(folders[0]);
        for(int i=1;i<folders.length;i++){
            if(!folders[i].startsWith(stack.peek()+"/")){
                stack.push(folders[i]);
            }
        }

        return new ArrayList<String>(stack);
    }
}
