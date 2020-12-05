class Solution {
    public int balancedStringSplit(String S) {
        int ans=0;
        int t=0;
        char s[]=S.toCharArray();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='L')
                t++;
            else
                t--;
            if(t==0)
                ans++;
                
        }
        return ans;
    }
}