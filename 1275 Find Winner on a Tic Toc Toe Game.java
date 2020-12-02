class Solution {
    public boolean check(char c,char s[],int t)
    {
        s[t]=c;
        if((s[0]==s[1] && s[0]==s[2] && s[0]!=0) || (s[3]==s[4] && s[3]==s[5] && s[3]!=0) || (s[6]==s[7] && s[6]==s[8] && s[6]!=0) || (s[0]==s[3] && s[0]==s[6] && s[0]!=0) || (s[1]==s[4] && s[1]==s[7] && s[1]!=0) || (s[2]==s[5] && s[2]==s[8] && s[2]!=0) ||  (s[0]==s[4] && s[0]==s[8] && s[4]!=0) || (s[2]==s[4] && s[2]==s[6] && s[2]!=0))
        {
            return true;
        }
        return false;
    }
    public String tictactoe(int[][] moves) {
        char s[]=new char[9];
        char f='X',e='O';
        int check1=0;
        int count=0;
        //for(char temp: s)
        //System.out.println((int)temp);
        for(int i=0;i<moves.length;i++)
        {
            int t=moves[i][0]*3+moves[i][1];
            char u=' ';
            if(check1==0)
                u=f;
            else 
                u=e;
            if(check(u,s,t))
                return check1==0?"A":"B";
            if(check1==0)
                check1=1;
            else
                check1=0;
           // System.out.println(u+" is put at target "+t+" at i "+moves[i][0]+" and j "+moves[i][1]+" and u ");
        }
        return moves.length==9?"Draw":"Pending";
    }
}