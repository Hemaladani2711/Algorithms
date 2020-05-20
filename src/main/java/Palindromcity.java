public class Palindromcity {

    /*Below are valid palindrome strings
    1. A man, a plan, a canal, Panama
    2. Able was I, ere I saw Elba!
    */
    public boolean testPalindrome(String text){
        int i = 0;
        int j = text.length()-1;

        while(i<j){
            while(!Character.isAlphabetic(text.charAt(i))){
                ++i;
            }
            while(!Character.isAlphabetic(text.charAt(j))){
                --j;
            }
            if(Character.compare(Character.toLowerCase(text.charAt(i)),Character.toLowerCase(text.charAt(j))) != 0){
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
