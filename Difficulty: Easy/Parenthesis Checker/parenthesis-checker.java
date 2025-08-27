
class Solution {
    static boolean isBalanced(String s) {
        // code here
       Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Opening 
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Closing 
            else {
                if (stack.isEmpty()) {
                    return false; 
                } 
                else if ((stack.peek() == '(' && ch == ')') ||
                         (stack.peek() == '{' && ch == '}') ||
                         (stack.peek() == '[' && ch == ']')) {
                    stack.pop(); 
                } 
                else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
