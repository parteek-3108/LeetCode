class Solution {
    int[] mem;
    public int integerBreak(int n) {
        if(n<4) return n-1;
        mem = new int[n+1];
        mem[0]=1;
        return t(n);
    }
    
    int t(int n){
        if(mem[n]!=0){
            return mem[n];
        }
        int max = 0;
        for(int i = 1 ; i <= n ;i++){
            max = Math.max(t(n-i) * i, max);
        }
        mem[n] = max;
        return max;
    }
}