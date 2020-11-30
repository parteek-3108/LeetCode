class Solution {
public int[] replaceElements(int[] a) {

    int max=a[a.length-1];  
    for(int i=a.length-2;i>=0;i--){
        int temp=a[i]; 
        a[i]=max;   
        
        if(temp>max){
            max=temp;   
			}
    }
    a[a.length-1]=-1;
    return a;
}
}