/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        
        List<List<Integer>>res= new ArrayList<>();
        
        int x=1;
        int y= 1000;
        int fxy=0;
        
        while(x<=1000 && y>=1){
            fxy=customfunction.f(x,y);
            
            if(fxy>z){
                y=y-1;
            }else if(fxy<z){
                x=x+1;
            }else{
                res.add(Arrays.asList(x,y));
                x=x+1;
            }
        }
        return res;
    }
}