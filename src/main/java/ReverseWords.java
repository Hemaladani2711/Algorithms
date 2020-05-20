public class ReverseWords {
    public String reverseAllWords(char [] input){
        
        char [] temp = reverse(input,0,input.length-1);
        int start=0;int end=0,n=input.length;
        System.out.println("temp.length: "+temp.length);
        while(start<n){
            System.out.println("start: "+input[start]);
            while (start<end||start<n && input[start]==' '){
                start++;
            }

            //System.out.println("start: "+temp[end]);
            while(end<start||end<n&&input[end]!=' '){
                end++;
            }

            temp = reverse(temp,start,end-1);

        }

        for (char i: temp) {
            System.out.println(""+i);
        }
        return null;
    }
    private char[] reverse(char [] input,int start, int end){
        System.out.println("reverse()");
        while(start<end){
           char temp = input[start];
           input[start++] = input[end];
           input[end--] = temp;
        }

        return input;
    }
}
