class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int maxLength = 0;
        int j = 0;

        while(j < s.length()){
            char c = s.charAt(j);
            
            if(map.containsKey(c)){
                i = Math.max(i, map.get(c) + 1); 
            }
            
            map.put(c, j); 
            
            maxLength = Math.max(maxLength, j - i + 1);
            
            j++;
        }
        return maxLength;
    }
}