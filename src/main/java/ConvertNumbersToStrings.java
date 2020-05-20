public class ConvertNumbersToStrings {
    private static String[]units = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private static String[]tens={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public static String convert(int n){
        if(n<20){
            return ""+units[n];
        }
        if(n<100){
            return ""+tens[n/10]+" "+convert(n%10);
        }
        if(n<1000){
            return ""+units[n/100]+" Hundred"+" "+convert(n%100);
        }
        if(n<10000){
            return ""+units[n/1000]+" Thousand"+" "+convert(n%1000);
        }
        if(n<100000){
            return ""+tens[n/10000]+" "+convert(n%10000);
        }
        if(n<1000000){
            return ""+units[n/100000]+" "+"hundred"+" "+convert(n%100000);
        }

            return ""+units[n/1000000]+" "+"million"+" "+convert(n%1000000);
    }
}
