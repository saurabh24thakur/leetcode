class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                swap(matrix,i,j);
                
            }
        }

        //  for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         System.out.print(matrix[i][j] +" ");
                
        //     }

        //     System.out.println();
        // }

        for(int i=0;i<matrix.length;i++){
            rev(matrix,i);
        }

        
    }


    private  void rev(int[][] matrix, int i) {
        int m=0,n=matrix[i].length-1;
        while(m<=n){
            int temp=matrix[i][m];
            matrix[i][m]=matrix[i][n];
            matrix[i][n]=temp;
            m++;
            n--;


        }
    }

    private  void swap(int[][] matrix, int i, int j) {

        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }

    
}