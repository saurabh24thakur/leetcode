class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=0;

        for(int i=min;i<=max;i++){
            if(nums[i]!=i){
                return i;
            }
        }

        return max+1;
        
    }
}