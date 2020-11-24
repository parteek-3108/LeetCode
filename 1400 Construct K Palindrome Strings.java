class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length())
            return false;
        if(k==s.length())
            return true;
        char s1[]=s.toCharArray();
        int a[]=new int[26];
        int pair=0,single=0;
        for(int i=0;i<s1.length;i++)
        {
            a[s1[i]-97]++;
            if((a[s1[i]-97]%2)==0)
                k++;
            else
                k--;
        }
        
        if(0<=k)
            return true;
        return false;
    }
}