class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSub = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSub = Math.max(maxSub, currentSum);
        }

        return maxSub;
    }
}