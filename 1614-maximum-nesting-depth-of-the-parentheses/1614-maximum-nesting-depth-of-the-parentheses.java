class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int c = 0;
        
        char[] characters = s.toCharArray();
        
        for (char ch : characters) {
            if (ch == '(') {
                c++;
                if (c > max) {
                    max = c;
                }
            } else if (ch == ')') {
                c--;
            }
        }
        
        return max;
    }
}