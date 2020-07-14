class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue=new LinkedList<>();
        int res=0;
        for (char c: s.toCharArray()){
            while(queue.contains(c)){
                //如果含有c，则一直出队列
                queue.poll();
            }
            queue.add(c);
            res=Math.max(res,queue.size());
        }
        return res;
    }
}
