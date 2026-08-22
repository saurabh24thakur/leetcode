class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(arr);
        return sub(arr,0,temp,ans);
    }

    public List<List<Integer>> sub(int[] arr, int i, List<Integer> temp, List<List<Integer>> ans){
        int n=arr.length;
        if(i==n){
            ans.add(new ArrayList<>(temp)); 
            return ans;
        }
        
        temp.add(arr[i]);
        sub(arr,i+1,temp,ans);
        temp.remove(temp.size()-1);
while (i + 1 < n && arr[i] == arr[i + 1]) {
            i++;
        }

        sub(arr,i+1,temp,ans);


        return ans;
    }
}