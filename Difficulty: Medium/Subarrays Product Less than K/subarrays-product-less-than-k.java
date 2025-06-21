// User function Template for Java

class Solution {

    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
      int l=0;
       long cnt=0;
       long pro=1;
       
       for(int i=0;i<arr.length;i++){
           pro*=arr[i];
          
          while(pro>=k && l<=i){
               pro=pro/arr[l];
               l++;
           }
             cnt+=i-l+1;
       }
       
       return cnt;
    }
}