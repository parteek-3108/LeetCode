class Solution {
    public int countCharacters(String[] words, String chars) {
        int a[]=new int[26];
        char s[]=chars.toCharArray();
        
        for(int i=0;i<s.length;i++)
        {
            a[s[i]-97]++;
        }
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            int t[]=new int[26];
            char s2[]=words[i].toCharArray();
            int j=0;
            for(;j<s2.length;j++)
            {
                t[s2[j]-97]++;
                if(t[s2[j]-97]>a[s2[j]-97])
                    break;          
            }
            if(j==s2.length)
                count+=s2.length;
        }
        return count;
    }
}