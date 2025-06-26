class Solution {
    public static void print_divisors(int n) {
        ArrayList<Integer> a = new ArrayList<>();  
        for(int i = 1; i <= n; i++) {  
            if(n % i == 0) {          
                a.add(i);
            }
        }
        
        // Print the divisors
        for(int divisor : a) {
            System.out.print(divisor + " ");
        }
    }
}