class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int i = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        for (int j = 0; j < nums.length; j++) {
            if (!dq.isEmpty() && dq.peekFirst() == j - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) {
                dq.pollLast();
            }

            dq.offerLast(j);

            if (j >= k - 1) {
                res[i++] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}