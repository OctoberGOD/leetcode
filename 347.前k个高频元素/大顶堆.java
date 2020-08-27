class Solution {
     public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num : nums) {
                if(map.get(num) == null) {
                    map.put(num, 1);
                } else {
                    int temp = map.get(num);
                    map.put(num, temp+1);
                }
            }
            PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>(){
                @Override
                public int compare(Integer a, Integer b) {
                    return map.get(b)-map.get(a);
                    //大顶堆
                }
            });
            for(int num : map.keySet()) {
                heap.add(num);
            }
            if(k>heap.size()) {
                return null;
            }
            int[] res = new int[k];
            for(int i=0;i<k;i++) {
                res[i] = heap.remove();
            }

            return res;
        }
}
