class Solution {
    public void nextPermutation(int[] nums) {
                int idx=-1;
        int n=nums.length;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                idx=i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for(int i=nums.length-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }

         reverse(nums, idx + 1, n - 1);




        
        
        
    }

     private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}