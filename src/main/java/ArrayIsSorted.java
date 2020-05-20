import java.util.Arrays;

public class ArrayIsSorted {
    public static boolean isSorted(String[] arr){

        String[] sorted =arr.clone();
        Arrays.sort(sorted);
        System.out.println(""+Arrays.toString(sorted));
        System.out.println(""+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(!sorted[i].equals(arr[i])){
                return false;
            }
        }
        return true;
    }

}
