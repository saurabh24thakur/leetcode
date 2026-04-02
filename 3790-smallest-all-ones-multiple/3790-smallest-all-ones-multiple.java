class Solution {
    public int minAllOneMultiple(int k) {
        int i=0;
        int n=1;
        int len=1;
        if (k % 2 == 0 || k % 5 == 0) return -1;
        while(n%k!=0){
            len++;
            i++;
            n = (n * 10 + 1) % k;

            if(len >k ) return -1;
        }

        return len;
        
    }
}