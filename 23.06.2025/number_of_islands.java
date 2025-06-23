import java.util.*;
//leetcode,gfg
class Pair{
    int row,col;
    public Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}

public class number_of_islands {
    public void bfs(int row,int col,char[][] grid,boolean[][] vis,int n,int m){
        vis[row][col]=true;
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(row,col));
        int[] delrow={-1,1,0,0};
        int delcol[]={0,0,1,-1};
        int i=0;
        while(!queue.isEmpty()){
            int currRow=queue.peek().row;
            int currCol=queue.peek().col;
            queue.remove();
            for( i=0;i<4;i++){
                
                    int nrow=currRow+delrow[i];
                    int ncol=currCol+delcol[i];
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol] && grid[nrow][ncol]=='L'){
                        vis[row][col]=true;
                        queue.add(new Pair(nrow,ncol));
                    }
            
            }
        }
    } 
    public int countIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int i,j;
        boolean[][] vis=new boolean[n][m];
        int count=0;
        for( i=0;i<n;i++){
            for( j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='L'){
                    count++;
                    bfs(i,j,grid,vis,n,m);
                }
            }
        }
        return count;
    }
}