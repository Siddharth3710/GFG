// User function Template for Java

class Solution {
    static int leastInterval(int N, int K, char tasks[]) {
        // code here
        int[]freq=new int [26];
        
        for(char task:tasks){
            freq[task- 'A']++;
        }
        Arrays.sort(freq);
        
       
        int chunk = freq[25] - 1;
        int idle = chunk * K;
        
        for(int i=24;i>=0;i--){
            idle-=Math.min(chunk,freq[i]);
        }
        
          if (idle < 0) {
            return tasks.length;          
        } else {
            return tasks.length + idle;   
        }
    }
}
