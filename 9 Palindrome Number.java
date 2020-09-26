class Solution {
    public boolean isPalindrome(int n) {
       if(n<0 ||(n%10==0 && n!=0))
           return false;
        int res=0;
        while(n>res)
        {
            res=res*10+n%10;
            n/=10;
        }
        return (res==n || res/10==n);
    }
}