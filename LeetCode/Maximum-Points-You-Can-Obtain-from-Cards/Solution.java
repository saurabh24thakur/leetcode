class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }
        
        int maxSum = currentSum;
        
        
        for (int i = 0; i < k; i++) {
           
            currentSum -= cardPoints[k - 1 - i];
            
           
            currentSum += cardPoints[n - 1 - i];
            
           
            maxSum = Integer.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}