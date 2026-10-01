class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0 ; i<strs.length ; i++){
            int[] freq = new int[26];
            for(char ch : strs[i].toCharArray()){
                freq[ch-'a']++;
            }

        String freqKey = Arrays.toString(freq);
        map.putIfAbsent(freqKey, new ArrayList<>());
        map.get(freqKey).add(strs[i]);
        }

        return new ArrayList<>(map.values()); 


    }
}
