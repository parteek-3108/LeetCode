class Solution {
    public int findMinFibonacciNumbers(int k) {
       int count=0; 
        int a=1,b=0,c=0;
        while(k!=0)
        {
            c=a+b;
            a=b;
            b=c;
            if(b==k)
                return (count+1);
            if(b>k)
            {
               count++;
                k-=a;
                a=1;
                b=0;
            }
        }
        return count;
    }
    
}