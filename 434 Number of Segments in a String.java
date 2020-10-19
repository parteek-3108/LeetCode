class Solution {
    public int countSegments(String s) {
        int count=0,state=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                state=0;
            }
            else if(state==0){
                count++;
                state=1;
            }
        }
        return count;
    }
}