class flood_fill_algorithm {
    //gfg
    public void dfs(int row,int col,int[][] image,int[][] ans,int ini,int newCol,int[] delrow,int[] delcol){
        ans[row][col]=newCol;
        int n=image.length,m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==ini && ans[nrow][ncol]!=newCol){
                dfs(nrow,ncol,image,ans,ini,newCol,delrow,delcol);
            }
        }
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int iniCol=image[sr][sc];
        int[][] ans=image;
        int[] delrow={-1,1,0,0};
        int[] delcol={0,0,1,-1};
        dfs(sr,sc,image,ans,iniCol,newColor,delrow,delcol);
        return ans;
    }
}