class Solution {
    public boolean isAnagram(String s, String t) {
         
      Map<Character , Integer> freq1 = new HashMap<>();
      Map<Character , Integer> freq2 = new HashMap<>();

      if(s.length() != t.length()) return false;

      for(char ch : s.toCharArray()){
            freq1.put(ch , freq1.getOrDefault(ch , 0 ) + 1);
      }

      for(char ch : t.toCharArray()){
            freq2.put(ch , freq2.getOrDefault(ch , 0 ) + 1);
      }

     for(char ch : s.toCharArray()){

      if(!freq1.get(ch).equals(freq2.get(ch))){
        return false;
      }
     }

     return true;
      
    }
}
