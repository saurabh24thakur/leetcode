class Solution {
    public int maxSum(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0, result = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < n) {
            sum1 += arr1[i++];
        }

        while (j < m) {
            sum2 += arr2[j++];
        }

        result += Math.max(sum1, sum2);

        final int MOD = 1_000_000_007;
        return (int) (result % MOD);
    }
}