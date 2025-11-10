class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String x=strs[0];
        String y=strs[strs.length-1];

        String ans="";

        int n1=x.length();
        int n2=y.length();

        for(int i=0;i<Math.min(n1,n2);i++){
            if(x.charAt(i)==y.charAt(i)) ans+=x.charAt(i);
            else break;
        }

        return ans;


    }
}