class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int escdist=0;
        if(target[0]<0)
            escdist-=target[0];
        else
            escdist+=target[0];
        if(target[1]<0)
            escdist-=target[1];
        else
            escdist+=target[1];
        for(int i=0;i<ghosts.length;i++)
        {
            int x=ghosts[i][0]-target[0];
            if(x<0)
                x=0-x;
            int y=ghosts[i][1]-target[1];
            if(y<0)
                y=0-y;
             if(x+y<=escdist)
                return false;   
        }
        
        return true;
    }
}