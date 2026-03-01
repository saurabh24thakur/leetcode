class Solution {
    public boolean rotateString(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        if (s.equals(t)) {
            return true;
        }

        int n = s.length();
        for (int i = 0; i < n; i++) {
            s = shiftLeft(s);
            if (s.equals(t)) {
                return true;
            }
        }

        return false;
    }

    private String shiftLeft(String str) {
        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        return remaining + firstChar;
    }
}