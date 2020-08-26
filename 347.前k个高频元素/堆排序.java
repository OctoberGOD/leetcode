class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        //遍历map,用最小堆保存频率最大的那个元素
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b) {
                //当前元素与parent进行比较,返回值大于0则停止比较
                //当前比较的就是map中的value,value大就在队列的底部
                return map.get(a)-map.get(b);
            }
        });
        for(Integer key :map.keySet()) {
            if(pq.size()<k) {
                pq.add(key);
            }else {
                pq.remove();
                pq.add(key);
            }
        }

        List<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()) {
            res.add(pq.remove());
        }
        return res;
    }
}
