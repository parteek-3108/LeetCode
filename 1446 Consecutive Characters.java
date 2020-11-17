class Solution {
    public int maxPower(String s) {
        if(s.length()<=1)
            return s.length();
        int count=1;
        int max=1;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length-1;i++)
            {
            count=1;
            while(i<(a.length-1) && a[i]==a[i+1]){
                i++;
                count++;
            }
            max=Math.max(max,count);
            }
        return max;
    }
}