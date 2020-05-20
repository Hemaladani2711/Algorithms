import java.util.Arrays;
import java.util.List;

public class StringToIntAndViceVersa {
    public int stringToInt(String s){
        //return (s.charAt(0) == '-'?-1:1) * s.substring(s.charAt(0) == '-'?1:0).chars().reduce(0,(runningSum,c)->runningSum*10+c - '0');
        int runningSum=0, i=0;
        boolean isNegative= (s.charAt(0)=='-')?true:false;
        i=(isNegative)?1:0;
        for( ;i<s.length();i++){
            runningSum = runningSum *10 + s.charAt(i) - '0';
        }

        return (isNegative)?runningSum*-1:runningSum;

    }
}
