class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        
        int max = 0;
        int c1 = 0, c2 = 0;

        for (int l = 0; l < s.length(); l++) {
            for (int r = l; r < s.length(); r++) {
                String t = s.substring(l, r + 1);
                
                if (isPalindrome(t)) {
                    if ((r - l + 1) > max) {
                        max = r - l + 1;
                        c1 = l;
                        c2 = r;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (c1 <= c2) {
            sb.append(s.charAt(c1));
            c1++;
        }

        return sb.toString();
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}