class Solution {
    public static void changeSign(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * -1;
        }
    }

    public static int kadanesAlgorithm(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;

    }

    public int maxSubarraySumCircular(int[] nums) {
        int linearMaxSum = kadanesAlgorithm(nums);
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = nums[i] * -1;

        }
        int circularSum = totalSum + kadanesAlgorithm(nums);
        if (circularSum == 0) {
            return linearMaxSum;
        }
        return Math.max(linearMaxSum, circularSum);

    }
}