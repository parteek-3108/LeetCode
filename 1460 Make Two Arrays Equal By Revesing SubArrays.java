class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length){
            return false;
        }
        else {
            Arrays.sort(target);
            Arrays.sort(arr);
          boolean res =  Arrays.equals(target, arr);
            if(res){
                return true;
            }else{
                return false;
            }
        }
    }
}