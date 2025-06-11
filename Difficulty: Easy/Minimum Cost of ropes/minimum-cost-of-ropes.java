class Solution {
    public static int minCost(int[] arr) {
        // code here
        int n=arr.length;
        int cost=0;
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int ropes:arr){
            pq.add(ropes);
            

        }
        while(pq.size()>1){
            int fir=pq.poll();
            int sec=pq.poll();
            
            int sum=fir+sec;
            cost+=sum;
            
            pq.add(sum);
        }
        
        
        return cost;
    }
}