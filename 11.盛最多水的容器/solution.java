class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1, V=0;
        while (right > left){
            V = Math.max(V, Math.min(height[left], height[right])*(right - left));
            if (height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return V;
    }
}
