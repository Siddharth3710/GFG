class Solution {
    static int findPosition(int n) {
        // Check if n is a power of 2 (has only one set bit)
        if(n == 0 || (n & (n - 1)) != 0) {
            return -1;
        }
        
        // Use built-in method to find position
        return Integer.numberOfTrailingZeros(n) + 1;
    }
}