class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map=new int[128];
        int start=0,end=0,len=0;
        while(end<s.length()){
            if(map[s.charAt(end++)]++==0){
                //如果map数组中没有当前字符
                //end+1，当前位置索引+1
                len=Math.max(len,end-start);
            }
            else{
                while(map[s.charAt(end-1)]>1){
                    //如果之前map数组中已经出现了当前字符
                    //而且出现了不止一次
                    map[s.charAt(start++)]--;
                    //沿着当前start位置每个位置索引-1
                }
            }
        }
        return len;
    }
}
