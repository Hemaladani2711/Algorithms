import java.util.Comparator;

public class Palindrome{
    public boolean isPalindrome(String word){
        for(int i=0, j =word.length()-1;i<j;i++,j--){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
        }
        return true;
    }

}
