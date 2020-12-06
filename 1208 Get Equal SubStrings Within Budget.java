class Solution {
    public int equalSubstring(String S, String T, int cost) {
        char s[]=S.toCharArray();
        char t[]=T.toCharArray();
        LinkedList<Integer> ind=new LinkedList();
        LinkedList<Integer> cos=new LinkedList();
        int count=0;
        int l=0,r=0;
        int max=0;
        while(r<s.length)
        {
            if(s[r]!=t[r])
            {
                if(cost<Math.abs(s[r]-t[r]))
                    break;
                cos.add(Math.abs(s[r]-t[r]));
                ind.add(r);
                cost-=Math.abs(s[r]-t[r]);
            }
            max++;
            r++;
        }
        if(r==s.length)
            return max;
        if(cos.size()==0)
        {
            r++;
             l=r;
        }
        else
        {
            l=ind.poll()+1;
            cost+=cos.poll(); 
        }
        while(r<s.length)
        {
            if(s[r]!=t[r])
            {
               if(cost<Math.abs(s[r]-t[r]))
               {
                 max=Math.max(max,r-l);
                   if(cos.size()==0)
                     {
                    r++;
                     l=r;
                     }
                else
                {
                  l=ind.poll()+1;
                  cost+=cos.poll(); 
                 }
                   
               }
                else
                {
                  cos.add(Math.abs(s[r]-t[r]));
                ind.add(r);
                cost-=Math.abs(s[r]-t[r]);
                    r++;
                }  
            }
            else
            r++;
            
        }
        max=Math.max(r-l,max);
        return max;
    }
}