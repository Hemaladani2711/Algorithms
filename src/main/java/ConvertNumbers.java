public class ConvertNumbers {
    static String [] ones= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eigtheen","ninteen"};
    static String [] tens={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    public static String convert(int number){
        if (number < 20) {
            return "" + ones[number];
        }
        if(number<100){
            return ""+tens[number/10]+" "+convert(number%10);
        }
        if(number<1000) {
            return "" + ones[number / 100] + " hundred " + convert(number % 100);
        }
            return "" + ones[number/1000]+ " thousand " + convert(number%1000);
    }
}
