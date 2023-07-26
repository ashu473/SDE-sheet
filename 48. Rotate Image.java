class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        // rotate the row to column & then reverse the element of row
        //    123 ->   147  ->   741
        //    456 ->   258  ->   852
        //    789 ->   369  ->   963 
        for(int i=0;i<n;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //  to reverse the element of row
        for(int i=0;i<n;i++){
            int m=matrix[i].length;
            for(int j=m-1;j>=m/2;j--){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                matrix[i][m-j-1]=temp;
            }
        }
    }
}