class Solution {
    boolean a[][];
    List <List<Integer>> x;
    public void checkr(int i,int j)
    {
        if(j>7)
            return ;
        if(a[i][j])
        {
            List t=new ArrayList<Integer>();
            t.add(i);
            t.add(j);
            x.add(t);
        }
        else
            checkr(i,j+1);
    }
    public void checkl(int i,int j)
    {
        if(j<0)
            return ;
        if(a[i][j])
        {
            List t=new ArrayList<Integer>();
            t.add(i);
            t.add(j);
            x.add(t);
        }
        else
            checkl(i,j-1);
    }
    public void checklt(int i,int j)
    {
        if(j<0 || i<0)
            return ;
        if(a[i][j])
        {
            List t=new ArrayList<Integer>();
            t.add(i);
            t.add(j);
            x.add(t);
        }
        else
            checklt(i-1,j-1);
    }
    public void checkrt(int i,int j)
    {
         if(j>7 || i<0)
            return ;
        if(a[i][j])
        {
            List t=new ArrayList<Integer>();
            t.add(i);
            t.add(j);
            x.add(t);
        }
        else
            checkrt(i-1,j+1);
    }
    public void checklb(int i,int j)
    {
         if(j<0 || i>7)
            return ;
        if(a[i][j])
        {
            List t=new ArrayList<Integer>();
            t.add(i);
            t.add(j);
            x.add(t);
        }
        else
            checklb(i+1,j-1);
    }
    public void checkrb(int i,int j)
    {
         if(j>7 || i>7)
            return ;
        if(a[i][j])
        {
            List t=new ArrayList<Integer>();
            t.add(i);
            t.add(j);
            x.add(t);
        }
        else
            checkrb(i+1,j+1);
    }
    public void checkt(int i,int j)
    {
         if(i<0)
            return ;
        if(a[i][j])
        {
            List t=new ArrayList<Integer>();
            t.add(i);
            t.add(j);
            x.add(t);
        }
        else
            checkt(i-1,j);
    }
    public void checkb(int i,int j)
    {
        if(i>7)
            return ;
        if(a[i][j])
        {
            List t=new ArrayList<Integer>();
            t.add(i);
            t.add(j);
            x.add(t);
        }
        else
            checkb(i+1,j);
    }
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        a=new boolean[8][8];
        for(int i=0;i<queens.length;i++)
        {
            a[queens[i][0]][queens[i][1]]=true;
        }
        x=new ArrayList<List<Integer>>();
        checkr(king[0],king[1]+1);
        checkl(king[0],king[1]-1);
        checkrt(king[0]-1,king[1]+1);
        checklt(king[0]-1,king[1]-1);
        checkrb(king[0]+1,king[1]+1);
        checklb(king[0]+1,king[1]-1);
        checkt(king[0]-1,king[1]);
        checkb(king[0]+1,king[1]);
        return x;
    }
}