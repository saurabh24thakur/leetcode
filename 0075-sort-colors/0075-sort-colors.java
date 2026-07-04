class Solution {
    public void sortColors(int[] arr) {
        int i=0,k=0,j=arr.length-1;

        while(k<=j){
            if(arr[k]==2){
                swap(arr,k,j);
                // k++;
                j--;
            }else if(arr[k]==0){
                swap(arr,k,i);
                k++;
                i++;
            }else{
                k++;
            }
        }

    }

    public  void swap(int[] arr, int k, int i) {
        int temp=arr[k];
        arr[k]=arr[i];
        arr[i]=temp;
    }
}