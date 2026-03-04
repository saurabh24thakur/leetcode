import java.util.*;

class Solution {
    public String frequencySort(String s) {
      
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

    //  it is my counter array contain index as frequency..
        List<Character>[] buckets = new List[s.length() + 1];
        for (char ch : map.keySet()) {
            int frequency = map.get(ch);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(ch);
        }


        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (char ch : buckets[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();
    }
}