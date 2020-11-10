class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if(s.length()!=t.length())
            return false;
        int a[]=new int[25];
        for(int i=0;i<25;i++)
        {
            a[i]=k/26;
            if(i<(k%26))
               a[i]++; 
        }
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        for(int i=0;i<s1.length;i++)
        {
    if(s1[i]==t1[i])
        continue;
           if((s1[i]<t1[i] && a[t1[i]-s1[i]-1]==0) || (s1[i]>t1[i] && a[26-s1[i]+t1[i]-1]==0))
           {
               return false;}
            if(s1[i]<t1[i])
                a[t1[i]-s1[i]-1]--;
            else 
                a[26-s1[i]+t1[i]-1]--;
        }
        return true;
        }
}