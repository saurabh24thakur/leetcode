class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (arr1[charS] != arr2[charT]) {
                return false;
            }

            arr1[charS] = i + 1;
            arr2[charT] = i + 1;
        }

        return true;
    }
}