class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int tg) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        return cs(arr, 0, temp, ans, tg);
    }

        public  List<List<Integer>> cs(int[] arr,int i,List<Integer> temp,List<List<Integer>> ans,int tg){
        if(tg==0){
            ans.add(new ArrayList<>(temp));
            return ans;
            
        }
        int n=arr.length;
        if(i==n){
            return ans;
        }
        
        if(arr[i]<=tg){
            temp.add(arr[i]);
            cs(arr,i,temp,ans,tg-arr[i]);
            temp.remove(temp.size()-1);
        }
        cs(arr, i+1, temp, ans, tg);


        return ans;

    }

}