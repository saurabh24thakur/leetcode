class Solution {
    public boolean rotateString(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        int n = s.length();
        for (int shift = 1; shift < n; shift++) {
            if (isMatch(s, t, shift)) {
                return true;
            }
        }
        return false;
    }

    private boolean isMatch(String s, String t, int shift) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt((i + shift) % n) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}