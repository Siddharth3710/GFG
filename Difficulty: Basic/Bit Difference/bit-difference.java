class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
        int x=a^b;
        int cnt=0;
        while(x!=0){
            if((x&1)==1){
                 cnt++;
            }
            x=x>>1;
           
            
        }
        return cnt;
    }
}
