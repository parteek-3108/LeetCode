class Solution {
    public void swap(char s[],int f,int se)
    {
        char t=s[f];
        s[f]=s[se];
        s[se]=t;
    }
    public String reverseStr(String S, int k) {
        char s[]=S.toCharArray();
        if(S.length()==0 || k==1)
            return S;
        int n=s.length/k;
        int fin=-1;
        for(int i=0;i<s.length;i++)
        {
           
            int min1=0;
            if((((i/k)+1)*k)<s.length)
                min1=((i/k)*k+k/2);
            else
            {
                min1=((i/k)*k+s.length)/2;
            }
            // System.out.println(i/k+" "+min1);
            if((i/k)%2==0 && i<min1)
            {
                
                fin=Math.min(((i/k)+1)*k-1,s.length-1);
                //System.out.println("before swap "+s[i]+" "+s[fin-(i-(i/k)*k)]);
                swap(s,i,fin-(i-(i/k)*k));
                //System.out.println("after swap "+s[i]+" "+s[fin-(i-(i/k)*k)]);
            }
            
        }
        String res=new String(s);
        return res;
    }
}