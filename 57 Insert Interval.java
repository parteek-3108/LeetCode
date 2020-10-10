import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0 && newInterval.length==0)
            return new int[0][0];
        if(intervals.length==0)
            return new int[][]{{newInterval[0],newInterval[1]}};
        if(newInterval.length==0)
            return intervals;
        
        Map <Integer,Integer> map=new TreeMap<Integer,Integer>();
        int check=0;
        int key=0;
        int value=0;
        for(int i=0;i<intervals.length;i++)
        {
            if(check==0 && newInterval[0]<=intervals[i][1])
            {
               if(newInterval[0]<=intervals[i][0])
               {
                   key=newInterval[0];                   
               }
                else
                {
                    key=intervals[i][0];
                }
                while(i<intervals.length && intervals[i][1]<newInterval[1])
                    i++;
                if(i==intervals.length || newInterval[1]<intervals[i][0])
                {
                    value=newInterval[1];
                    i--;
                }
                else
                {
                    System.out.println("entered");
                    value=intervals[i][1];
                }
                check=1;
            }
            else
            {
               key=intervals[i][0];
                value=intervals[i][1];
            }
            System.out.println(i+" "+ key+" "+value);
            map.put(key,value);
        }
        if(check==0)
        {
           map.put(newInterval[0],newInterval[1]); 
        }
        Set <Integer> s=map.keySet();
        int result[][]=new int[s.size()][2];
        Iterator <Integer> itr=s.iterator();
        int i=0;
        while(itr.hasNext())
        {
            int temp=itr.next();
            result[i][0]=temp;
            result[i][1]=map.get(temp);
            i++;
        }
        return result;
    }
}