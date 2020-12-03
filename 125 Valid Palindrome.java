class Solution {
    public boolean isPalindrome(String s) {
char a[]=s.toCharArray();
        int b[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>='A' && a[i]<='Z')
                b[j++]=a[i]+32 ;
            else if((a[i]>='a' && a[i]<='z') || (a[i]>='0' && a[i]<='9'))
                b[j++]=a[i];
        }
        for(int i=0;i<j/2;i++)
        {
            if(b[i]!=b[j-1-i])
                return false;
        }
        return true;
    }
}