class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // If there is only one element, return early.
        if(index.length == 1 ){
            return nums;
        }
        
        int[] retArray = new int[nums.length];
        ArrayList tempArr = new ArrayList();
        
        // Take advantage of ArrayList.add() so we don't have to
        // manually reorder array elements on each add().
        for(int i = 0;i<nums.length;i++){
            tempArr.add(index[i],nums[i]);
        }
        
        // Fill our int[] with the elements in our ArrayList
        for(int k = 0;k<tempArr.size();k++){
            // Because ArrayList.get() returns Object type, we have
            // type cast to an integer.
            retArray[k] = (Integer)tempArr.get(k);
        }
        return retArray;
    }
}