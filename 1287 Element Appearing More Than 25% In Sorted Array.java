class Solution {
    public int lowerbound(int n,int a[])
    {
        int left=0;
        int right=a.length-1;
        int mid=(left+right)/2;
        while(right>=left)
        {
            if((mid==0 || a[mid-1]<a[mid]) && a[mid]==n)
           return mid;
             else if(a[mid]<n)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            mid=(left+right)/2;
                
        }
        return -1;
    }
    public int upperbound(int lower,int n,int a[])
    {
        int left=lower;
        int right=a.length-1;
        int mid=(left+right)/2;
        while(right>=left)
        {
            if((mid==(a.length-1) || a[mid+1]>a[mid]) && a[mid]==n)
           return mid;
             else if(a[mid]<=n)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            mid=(left+right)/2;                
        }
        return -1; 
    }
    public int checkfreq(int num,int arr[])
    {
        int left=lowerbound(num,arr);
        int right=upperbound(left,num,arr);
        System.out.println("left "+left+" right"+right);
        return right-left+1;
    }
    public int findSpecialInteger(int[] arr) {
        int start=0;
        if(arr.length%4==0)
            start=arr.length/4-1;
        else
            start=arr.length/4;
        while(start<arr.length)
        {
            int t=checkfreq(arr[start],arr);
            System.out.println(start+" "+t);
            if(t>arr.length/4)
                return arr[start];
            start+=arr.length/4;
            if(arr.length/4==0)
                start++;
            if(start>=arr.length)
            {
                int temp=checkfreq(arr[arr.length-1],arr);
                if(temp>arr.length/4)
                return arr[arr.length-1];
            }
        }
       return arr[0];     
    }
}