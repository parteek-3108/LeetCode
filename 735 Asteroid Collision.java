class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack <Integer> x = new Stack<Integer>();
        for(int k=0;k<a.length;k++)
        {
             int check=0;
                if(a[k]<0)
                {
                   
                while(!x.empty() && x.peek()>0 && Math.abs(0-x.peek())<=Math.abs(0-a[k]))
                {int temp=x.pop();
                if(Math.abs(0-temp)==Math.abs(0-a[k]))
                {check=1;break;}
                }
                    if((x.empty() || x.peek()<0) && check!=1){
                x.push(a[k]);}
                }  
            else{
                x.push(a[k]);}
        }
        int res[]=new int[x.size()];
        int size=x.size()-1;
        while(!x.empty())
        { res[size]=x.pop();
        size--;}
        return res;
    }
}