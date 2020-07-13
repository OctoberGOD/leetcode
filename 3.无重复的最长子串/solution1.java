class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)    return 0;
        //空字符串
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        for (int i=0,j=0;i<s.length();++i){
            if (map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i))+1);
                //疑点1：直接更新j为什么不行
                //解答：如果重复的字母出现在非常前面，则不能直接用i+1
            }
            map.put(s.charAt(i),i);
            max = Math.max(max , i-j+1);
        }
        return max;
    }
}
