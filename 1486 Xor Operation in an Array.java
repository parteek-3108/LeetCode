class Solution {
    public int xorOperation(int n, int start) {
        int prod=0;
        int i=0;
        while(i<n)
        {
            prod^=(2*i+start);
            i++;
        }
        return prod;
    }
}