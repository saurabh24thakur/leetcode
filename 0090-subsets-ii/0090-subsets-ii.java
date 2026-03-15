class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        // int[] arr={1,2,2};
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        res.add(new ArrayList<>());
        Arrays.sort(arr);
        subsets(arr, 0, list, res);
        return res;
    }

    public static void subsets(int[] arr,int start, List<Integer> list, List<List<Integer>> res){
        if(start==arr.length){
            return;
        }

        for(int i=start;i<arr.length;i++){

            if (i > start && arr[i] == arr[i - 1]) continue;
            
            int ele=arr[i];
            list.add(ele);
            res.add(new ArrayList<>(list));
            subsets(arr, i+1, list, res);
            list.remove(list.size()-1);


        }
    }
}