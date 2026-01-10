class Solution {
    public double myPowHelper(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        if (n == Integer.MIN_VALUE) {
            double res = myPowHelper(x, n / 2);
            return res * res;
        }
        
        if (n < 0) {
            return 1.0 / myPowHelper(x, -n);
        }
        
        double res = myPowHelper(x, n / 2);
        if (n % 2 == 0) {
            return res * res;
        } else {
            return res * res * x;
        }
    }

    public double myPow(double x, int n) {
        double res = myPowHelper(x, n);
        return res;
    }
}