class Solution {
    public boolean search(int[] nums, int target) {
        if(bs(nums,target)==-1){
            return false;
        }else{
            return true;
        }
        
    }

    public int bs(int[] arr,int tg){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==tg){
                return mid;

            }

            if (arr[start] == arr[mid]) {
                start++;
                continue;
            }
            // check if left part is sorted
            if(arr[start]<arr[mid]){
                if(arr[start]<=tg && arr[mid]>=tg){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]<=tg && arr[end]>=tg){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return ans;
    }
}