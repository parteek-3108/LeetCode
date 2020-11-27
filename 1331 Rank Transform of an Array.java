class Solution {
    public int search(int target,int a[],int r)
    {
        int l=0;
        int mid=(l+r)/2;
        while(l<=r)
        {
        mid=(l+r)/2;
            if(a[mid]==target)
                break;
            else if(a[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return mid+1;
    }
    public int[] arrayRankTransform(int[] arr) {
        int a[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
        Arrays.sort(a);
        int t[]=new int[a.length];
        int k=1;
        if(a.length>=1)
            t[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            
            if(a[i]!=a[i-1])
            {
                t[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=search(arr[i],t,k);
        }
        return arr;
    }
}