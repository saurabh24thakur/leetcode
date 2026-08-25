class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> res=new LinkedList<>();
        List<Integer> temp=new LinkedList<>();
        int n=arr.length;
        boolean[] used=new boolean[n];
        permute(arr,used,temp,res);
        return res;
    }

   public static List<List<Integer>> permute(int[] arr,boolean[] used,List<Integer> temp,List<List<Integer>> res){
        if(temp.size()==arr.length){
            res.add(new LinkedList<>(temp));
            return res;
        }
       
        for(int i=0;i<arr.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            temp.add(arr[i]);
            permute(arr,used,temp,res);
            temp.remove(temp.size()-1);
            used[i]=false;
        }

        return res;

        
    }


}