class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        if(hand.length%W!=0)
            return false;
        Arrays.sort(hand);
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        List <Integer> list=new ArrayList<Integer>();
        list.add(hand[0]);
        map.put(hand[0],1);
        for(int i=1;i<hand.length;i++)
        {
           if(hand[i]!=hand[i-1])
               list.add(hand[i]);
                
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
            
        }
        // for(int i=0;i<list.size();i++)
        //     System.out.print(list.get(i)+" ");
        for(int i=0;i<list.size();i++)
        {
            int count=map.get(list.get(i));
            int index=i;
            int check=0;
            int limit=list.get(i)+W-1;
            while(index<list.size() && list.get(index)<=limit)
            {
                if(map.get(list.get(index))>count && check==0)
                {i=index-1;check=1;}
                if(map.get(list.get(index))<count)
                    return false;
                map.put(list.get(index),map.get(list.get(index))-count);
                index++;
            }
            if((check==1 && index>=list.size()) || (list.get(index-1)<limit))
                return false;
           
            if(check==0)
                i=index-1;
        }
        return true;
    }
}