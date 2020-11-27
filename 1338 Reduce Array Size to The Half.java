class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;

        int max = 0;
        for(int val : arr){
            if(val > max) max = val;
        }
        
        int[] hash = new int[max+1];
        for(int val : arr){
            hash[val]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        
        for(int val : hash){
            if(val != 0)
                pq.offer(val);
        }
        
        int deletedSize = 0;
        int count = 0;
        while(!pq.isEmpty()){
            deletedSize += pq.poll();
            count++;
            if(2*deletedSize >=n )
                break;
        }
        
        return count;
    }
}