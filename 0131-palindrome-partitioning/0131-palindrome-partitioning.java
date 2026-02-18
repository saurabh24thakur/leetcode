class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        valid(s, ll, result);
        return result;
    }
    public static void valid(String ques, List<String> ll, List<List<String>> result) {
        if (ques.length() == 0) {
            result.add(new ArrayList<>(ll));
            return;
        }

        for (int cut = 1; cut <= ques.length(); cut++) {
            String s = ques.substring(0, cut);

            if (palindrome(s)) {
                ll.add(s);
                valid(ques.substring(cut), ll, result);
                ll.remove(ll.size() - 1);   
            }
        }
    }

    public static boolean palindrome(String s) {
        int end = s.length() - 1;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(end)) {
                return false;
            }
            end--;
        }
        return true;
    }
}