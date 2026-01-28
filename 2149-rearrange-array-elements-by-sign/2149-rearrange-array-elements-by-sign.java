class Solution {
    public int[] rearrangeArray(int[] nums) {
        int cp=0,cn=0;
        int p,n;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                cp++;

            }else{
                cn++;
            }
        }

        if(cp>=cn){
            p=0;
            n=1;
        }else{
            p=1;
            n=0;
        }

        for(int num:nums){
            if(num>=0){
                arr[p]=num;
                p=p+2;
            }else{
                arr[n]=num;
                n=n+2;
            }
        }


        return arr;


    }
}