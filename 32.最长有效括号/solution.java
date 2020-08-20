class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new LinkedList<Integer>();
        int len=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                len=Math.max(len,i-stack.peek());
            }
        }
        return len;
    }
}
