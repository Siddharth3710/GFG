class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>a=new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            
            
            if (s.isEmpty()) {
                a.add(arr[i]);
            }
            
          
            s.push(arr[i]);
        }
        Collections.reverse(a);
           return a;
    }
}
