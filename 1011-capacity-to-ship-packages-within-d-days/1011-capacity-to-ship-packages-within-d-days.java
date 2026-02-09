class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap = 0, maxCap = 0;

        for (int weight : weights) {
            minCap = Math.max(minCap, weight);
            maxCap += weight;
        }

        int low = minCap, high = maxCap;
        int ans = maxCap;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int currentDays = 1;
        int currentWeight = 0;

        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                currentDays++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }

        return currentDays <= days;
    }
}