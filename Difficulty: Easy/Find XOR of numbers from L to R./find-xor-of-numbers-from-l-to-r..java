class Solution {
    public static int findXOR(int l, int r) {
        // XOR from l to r = XOR(1 to r) ^ XOR(1 to l-1)
        return xorFromOne(r) ^ xorFromOne(l - 1);
    }
    
    // Helper function to find XOR from 1 to n
    private static int xorFromOne(int n) {
        if (n <= 0) return 0;
        
        if (n % 4 == 0) {
            return n;        // NOT 1
        }
        else if (n % 4 == 1) {
            return 1;
        }
        else if (n % 4 == 2) {
            return n + 1;    // n, not N
        }
        else { // n % 4 == 3
            return 0;
        }
    }
}