class Solution {
    public int findMin(int[] nums) {
        return bs(nums);
    }

    public int bs(int[] arr){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<arr[end]){
                end=mid;
            }else{
                start=mid+1;
            }


            

           
            
    }
        return arr[end];

    }


    
}