class Solution {
    public boolean buddyStrings(String A, String B) {
    if(A.length()!=B.length()){
        return false;
    }
        int e=0;
        char f=' ',s=' ',eq=' ';
        int c=1;
        for(int i=0;i<A.length();i++){
            
            if(A.charAt(i)==B.charAt(i))
            {
                if(eq==' ')
                eq=A.charAt(i);
                else {
                    if(eq==A.charAt(i)){
                        e++;
                    }
                }
        }
            if(A.charAt(i)!=B.charAt(i) && c==1){
                f=A.charAt(i);
                s=B.charAt(i);
                c--;
            }
            else if(A.charAt(i)!=B.charAt(i)){
                if(c<0 || A.charAt(i)!=s || B.charAt(i)!=f){
return false;}    
                c--;
            }
                     
        }
        if(c==-1 || e>0)
        {
            return true;
        }
        return false;
    }
}