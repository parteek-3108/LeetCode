import java.math.*;
class Solution {
    public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
}
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Map<Double,Integer> map=new HashMap<Double,Integer>();
        map.put(Math.sqrt(Math.pow(p1[0]-p2[0],2) +Math.pow(p1[1]-p2[1],2)),map.getOrDefault(Math.sqrt(Math.pow(p1[0]-p2[0],2) +Math.pow(p1[1]-p2[1],2)),0)+1);
        map.put(Math.sqrt(Math.pow(p1[0]-p3[0],2) +Math.pow(p1[1]-p3[1],2)),map.getOrDefault(Math.sqrt(Math.pow(p1[0]-p3[0],2) +Math.pow(p1[1]-p3[1],2)),0)+1);
        map.put(Math.sqrt(Math.pow(p1[0]-p4[0],2) +Math.pow(p1[1]-p4[1],2)),map.getOrDefault(Math.sqrt(Math.pow(p1[0]-p4[0],2) +Math.pow(p1[1]-p4[1],2)),0)+1);
        if(map.size()>2)
            return false;
        map.put(Math.sqrt(Math.pow(p3[0]-p2[0],2) +Math.pow(p3[1]-p2[1],2)),map.getOrDefault(Math.sqrt(Math.pow(p3[0]-p2[0],2) +Math.pow(p3[1]-p2[1],2)),0)+1);
       if(map.size()>2)
            return false;
        map.put(Math.sqrt(Math.pow(p4[0]-p2[0],2) +Math.pow(p4[1]-p2[1],2)),map.getOrDefault(Math.sqrt(Math.pow(p4[0]-p2[0],2) +Math.pow(p4[1]-p2[1],2)),0)+1);
       if(map.size()>2)
            return false;
        map.put(Math.sqrt(Math.pow(p3[0]-p4[0],2) +Math.pow(p3[1]-p4[1],2)),map.getOrDefault(Math.sqrt(Math.pow(p3[0]-p4[0],2) +Math.pow(p3[1]-p4[1],2)),0)+1);
        List <Double>list=new ArrayList(map.keySet());
        if(map.size()!=2 || Math.abs(map.get(list.get(0))-map.get(list.get(1)))!=2)
            return false;
        int i=0;
        int r=1;
        if(map.get(list.get(i))!=4)
        {i=1;r=0;}
        if(round(Math.sqrt(2)*list.get(i),3)==round(list.get(r),3))
            return true;
        return false;
    }
}