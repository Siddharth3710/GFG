// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
       Queue<Integer> positives = new LinkedList<>();
        Queue<Integer> negatives = new LinkedList<>();
        
        // Separate positive and negative numbers
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                positives.add(arr.get(i));
            } else {
                negatives.add(arr.get(i));
            }
        }
        
        int i = 0;
        
       
        while (!positives.isEmpty() && !negatives.isEmpty()) {
            arr.set(i++, positives.poll());
            arr.set(i++, negatives.poll());
        }
        
        while (!positives.isEmpty()) {
            arr.set(i++, positives.poll());
        }
        
        while (!negatives.isEmpty()) {
            arr.set(i++, negatives.poll());
        }
        
    }
}