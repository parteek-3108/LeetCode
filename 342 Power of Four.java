class Solution {
    public boolean isPowerOfFour(int num) {
        double n=Math.log(num)/Math.log(4);
        System.out.println(n);
        if((int)(n*2)/2==n)
            return true;
        return false;
    }
}