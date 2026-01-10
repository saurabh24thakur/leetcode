class Solution {
    Map<String,Integer> map=new HashMap<>();
    public int getRowColHelper(int row,int col){
        if(row==0 || col==0 || row==col){
            return 1;

        }

        String key=Integer.toString(row)+" "+Integer.toString(col);

        if(map.containsKey(key)){
            return map.get(key);
        }

        int res=getRowColHelper(row-1,col-1)+getRowColHelper(row-1,col);

        map.put(key,res);

        return res;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();

        int row=rowIndex;

        for(int col=0;col<=rowIndex;col++){
            res.add(getRowColHelper(row,col));
        }

        return res;
    }
}