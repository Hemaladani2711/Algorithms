import java.util.ArrayList;
import java.util.Arrays;

public class OnlinePurchaseManager {
    private ArrayList<Gizmo> purchases;
    public OnlinePurchaseManager(){
        purchases = new ArrayList<>();
        Gizmo g1 = new Gizmo();
        g1.setElectronic(true);
        g1.setMaker("ABC");
        Gizmo g2 = new Gizmo();
        g2.setElectronic(false);
        g2.setMaker("lmnop");
        Gizmo g3 = new Gizmo();
        g3.setElectronic(true);
        g3.setMaker("ABC");
        purchases.add(g1);
        purchases.add(g1);
        purchases.add(g2);
        purchases.add(g3);
        System.out.println(Arrays.toString(purchases.toArray()));
    }

    public int countElectronicsByMaker(String maker){
      int count=0;
        for(int i=0;i<purchases.size();i++){
            if(purchases.get(i).isElectronic() && purchases.get(i).getMaker().equals(maker)){
                count++;
            }
        }
       return count;
    }
    public boolean hasAdjacentEqualPair(){
        if(purchases.size()<2)
        return false;
        for(int i=0;i<purchases.size()-1;i++){
            if(purchases.get(i).equals(purchases.get(i+1))){
                return true;
            }
        }
        return false;
    }
}
