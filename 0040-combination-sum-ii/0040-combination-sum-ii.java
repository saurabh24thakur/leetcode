class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int tg) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        // int[] nums={10,1,2,7,6,1,5};
        Arrays.sort(candidates);
        // int tg=8;
        sum(candidates,0, list, tg, res);
        return res;
    }

    public void sum(int[] nums,int start,List<Integer> list,int target,List<List<Integer>> res){
        if(target==0){
            // Collection.sort(list);
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<nums.length;i++){
            // skipping same elem
            if (i > start && nums[i] == nums[i - 1]) continue;

            if(nums[i]<=target){
                list.add(nums[i]);
                sum(nums,i+1, list, target-nums[i], res);
                list.remove(list.size()-1);
            }
        }
    }
}