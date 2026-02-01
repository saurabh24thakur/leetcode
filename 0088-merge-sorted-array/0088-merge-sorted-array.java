class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int index = 0;
        int[] nums = new int[nums1.length];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums[index] = nums1[i];
                i++;
            } else {
                nums[index] = nums2[j];
                j++;
            }
            index++;
        }

        while (i < m) {
            nums[index] = nums1[i];
            i++;
            index++;
        }

        while (j < n) {
            nums[index] = nums2[j];
            j++;
            index++;
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = nums[k];
        }
    }
}