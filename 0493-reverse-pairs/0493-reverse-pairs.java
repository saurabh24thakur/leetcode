class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    public int mergeSort(int[] arr, int start, int end) {
        if (start >= end) return 0;
        int count = 0;
        int mid = start + (end - start) / 2;

        count += mergeSort(arr, start, mid);
        count += mergeSort(arr, mid + 1, end);
        count += countPairs(arr, start, mid, end);

        merge(arr, start, mid, end);

        return count;
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int[] res = new int[high - low + 1];
        int li = low, ri = mid + 1, idx = 0;

        while (li <= mid && ri <= high) {
            if (arr[li] <= arr[ri]) {
                res[idx++] = arr[li++];
            } else {
                res[idx++] = arr[ri++];
            }
        }

        while (li <= mid) res[idx++] = arr[li++];
        while (ri <= high) res[idx++] = arr[ri++];

        for (int i = 0; i < res.length; i++) {
            arr[low + i] = res[i];
        }
    }
}