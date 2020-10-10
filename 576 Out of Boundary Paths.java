class Solution {
    int a[][]=new int[1][1];
    public int find(int m,int n,int N,int i,int j)
    {
        
        int count=0;
        if(i==m || j==n ||  i==-1 || j==-1)
            return 1;
        if(N<=0)
            return 0;
       // System.out.println(i*n+j+" indices "+i+" "+j);
        if(a[i*n+j][N-1]!=0)    
        {
            if(a[i*n+j][N-1]==-1)
                return 0;
            return a[i*n+j][N-1];}
        count+=find(m,n,N-1,i,j-1);
        count%=1000000007;
        count+=find(m,n,N-1,i+1,j);
        count%=1000000007;
           count+=find(m,n,N-1,i-1,j);
        count%=1000000007;
            count+=find(m,n,N-1,i,j+1);
        count%=1000000007;
        if(count==0)
            a[i*n+j][N-1]=-1;
        else
            a[i*n+j][N-1]=count;
        return count;
    }
    public int findPaths(int m, int n, int N, int i, int j) {
        a=new int[m*n][N];
       return  find(m,n,N,i,j);
    }
}