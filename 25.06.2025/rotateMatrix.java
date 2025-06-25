public class rotateMatrix {
    static void rotate(int mat[][]) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }
        }
         
     }
}
