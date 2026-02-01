class Solution {
    public int searchInsert(int[] nums, int target) {
        return bs(nums, target);
    }

    public int bs(int[] arr, int tg) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == tg) {
                return mid; 
            } else if (arr[mid] > tg) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
       
        return start;
    }
}