class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;

        long sum=0;

        int i=0,j=0;
        while(j<nums.length){
            sum=sum+nums[j];

            while((long)nums[j]*(j-i+1)-sum>k){
                sum=sum-nums[i];
                i=i+1;

            }

            max=Math.max(max,j-i+1);

            j++;


        }

        return max;

    }
}