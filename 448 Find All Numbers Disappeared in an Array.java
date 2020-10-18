class Solution {
    public List<Integer> findDisappearedNumbers(int[] n) {
     for(int i=0;i<n.length;i++)
     {
         int t=n[i]-1;
         //System.out.println(" i "+t);
         while(t>=0 &&  n[t]!=0)
         {
             int temp=n[t];
             n[t]=0;
            // System.out.println(temp+" temp ");
             t=temp-1;
         }
             
     }
        ArrayList <Integer>list=new ArrayList<Integer>();
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>0)
                list.add(i+1);
        }
        return list;
    }
}