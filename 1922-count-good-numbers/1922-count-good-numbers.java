class Solution {
    long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long firstPart = power(5, evenPositions);
        long secondPart = power(4, oddPositions);

        return (int) ((firstPart * secondPart) % MOD);
    }

    
    public long power(long x, long y) {
        if (y == 0) return 1;
        
        long res = power(x, y / 2);
        res = (res * res) % MOD;
        
        if (y % 2 != 0) {
            res = (res * x) % MOD;
        }
        
        return res;
    }
}