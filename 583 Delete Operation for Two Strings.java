class Solution {
    public int minDistance(String word1, String word2) {
        int a[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++)
        {
            for(int j=0;j<=word2.length();j++)
            {
            if(i==0 || j==0)
                a[i][j]=0;
            else
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                  a[i][j]=a[i-1][j-1]+1;  
                }
                else
                    a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
            }
            }
        }
        return word1.length()+word2.length()-2*a[word1.length()][word2.length()];
    }
}
