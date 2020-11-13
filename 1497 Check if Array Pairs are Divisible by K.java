class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        int[] mod = new int[k];
        for(int i =0; i< arr.length; i++){
            if(arr[i] <0){
                mod[Math.abs(arr[i]%k)]--;
            }else 
                mod[Math.abs(arr[i]%k)]++;
        }
        if(mod[0]%2 != 0)
            return false;
        for(int i = 1; i< mod.length-i; i++){
            if(mod[i] != mod[mod.length-i])
                return false;
        }
        return true;
    }
}