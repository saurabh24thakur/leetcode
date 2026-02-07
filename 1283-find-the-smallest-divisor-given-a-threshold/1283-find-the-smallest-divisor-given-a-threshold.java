class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 1000000; 
        
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(nums, threshold, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean check(int[] nums, int threshold, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num / divisor) + (num % divisor == 0 ? 0 : 1);
            if (sum > threshold) return false; 
        }
        return sum <= threshold;
    }
}