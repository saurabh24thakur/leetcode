public class Solution {
    public int majorityElement(int[] num) {
        int majority = num[0];
        int votes = 1;

        for (int i = 1; i < num.length; i++) {
            if (votes == 0) {
                majority = num[i];
                votes = 1;
            } else if (majority == num[i]) {
                votes++;
            } else {
                votes--;
            }
        }

        return majority;
    }

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[] testInput = {2, 2, 2, 2, 2, 2, 1};
    //     System.out.println(sol.majorityElement(testInput));
    // }
}