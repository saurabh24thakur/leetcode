class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) {
                return 0;
         }
        int i=0,maxCount=1,count=1;
        for(i=0;i<nums.length-1;i++){
            
            if(nums[i+1]==nums[i]){
                continue;
            }else if(nums[i+1]==nums[i]+1){
                count++;
                if(maxCount<count){
                    maxCount=count;
                }
            }else{
                count=1;
            }
        }

        return maxCount;

        
        
    }
}