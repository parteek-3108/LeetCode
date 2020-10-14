class Solution {
    public int fib(int N) {
        int a=1,b=0,c=0;
        while(N-->0)
        {
            c=a+b;
            a=b;b=c;
        }
        return c;
    }
}