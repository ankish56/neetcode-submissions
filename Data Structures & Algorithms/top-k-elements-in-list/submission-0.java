class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
      Map<Integer , Integer> freqMap = new HashMap<>();

      // Step 1: Count frequencies
      for(int n : nums){
        freqMap.put(n , freqMap.getOrDefault(n , 0)+1);
      }

      // Step 2: Create buckets
      List<Integer>[] buckets = new ArrayList[nums.length + 1];
      for(int i=0 ; i < buckets.length ; i++){
        buckets[i] = new ArrayList<>();
      }

       // Step 3: Fill buckets
       for(int key : freqMap.keySet()){
        int freq = freqMap.get(key);
        buckets[freq].add(key);
       }

        // Step 4: Collect top k
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            for(int num : buckets[i]){
                result.add(num);
                 if (result.size() == k) break;
            }
        }

                // Convert List → int[]
        int[] ans = new int[k];
        for(int i = 0 ; i < k ; i++){
            ans[i] = result.get(i);
        }

        return ans;


    }
}
