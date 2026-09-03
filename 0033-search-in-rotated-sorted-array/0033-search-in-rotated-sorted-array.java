class Solution {
    public int search(int[] arr, int tg) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == tg) {
                ans = mid;
                return mid;
            } else if (tg < arr[mid]) {
                if (arr[low] <= arr[mid] ? tg < arr[low] : false) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (arr[mid] > arr[high] || tg <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return ans;
    }
}