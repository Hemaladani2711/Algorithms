public class StraightLine {
    public static boolean isStraightLine(int [][] coordinates){
        int [] point1 = coordinates[1];
        int [] point2 = coordinates[0];
        float gSlope = slope(point1,point2);
        for(int i=2;i<coordinates.length;i++){
            int[] p1 =coordinates[i-1];
            int[] p2 = coordinates[i];
            float slop = slope(p1,p2);
            if (gSlope != slop)return false;
        }
        return true;
    }
    public static float slope(int []p1,int []p2){
        float m =(float)(p2[1]-p1[1]) / (p2[0] - p1[0]);
        return m;
    }
}
