public class Stars {

    public void printStars(int n){

        for(int i = 1; i<n;i+=2){

            for(int j=1; j<= i; j+=2){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
