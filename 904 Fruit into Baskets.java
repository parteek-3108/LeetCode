class Solution {
    public int totalFruit(int[] tree) {
       int count=0,max=0,first=-1,second=-1,lcount=1;
for(int i=0;i<tree.length;i++)
{
    if(tree[i]==first || second==tree[i])
    {
        if(tree[i]==tree[i-1])
        {
            lcount++;
        }
        else
            lcount=1;
        count++;          
    }
    else if(first==-1)
    {first=tree[i];
    count=1;}
    else if(second==-1)
    {
        second=tree[i];
        count++;
        lcount=1;         
    }
    else 
    {
       count=lcount+1;
        first=tree[i-1];
        second=tree[i];
        lcount=1;        
    }
    max=Math.max(count,max);
}
        
        return Math.max(count,max);
        
    }
}