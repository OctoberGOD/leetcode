class Solution {
    public int calculate(String s) {
        Deque<Integer> stack=new LinkedList<Integer>();
        int operand = 0;
        int res = 0;
        int sign = 1;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '+'){
                res+=(int)sign*operand;
                sign=1;
                operand=0;
            }else if(ch == '-') {
                res+=(int)sign*operand;
                sign=-1;
                operand=0;
            }else if(Character.isDigit(ch)) {
                operand=operand*10+(int)(ch-'0');
            }else if(ch == '(') {
                stack.push(res);
                stack.push(sign);
                res=0;
                sign=1;
            }else if(ch == ')') {
                res+=sign*operand;
                res*=stack.pop();
                res+=stack.pop();
                operand=0;
            }
        }
        return res+sign*operand;
    }
}
