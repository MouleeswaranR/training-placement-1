import java.util.*;
class bipartite_graph_using_bfs {
    public boolean checkBipartite(int start,ArrayList<ArrayList<Integer>> adj,int[] color){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        color[start]=0;
        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int adjNode:adj.get(node)){
                if(color[adjNode]==-1){
                    color[adjNode]=1-color[node];
                    queue.add(adjNode);
                }else if(color[node]==color[adjNode]){
                    return false;
                }
            }
          
           
    }
     return true;
    }
    public boolean isBipartite(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int[] edge:edges){
            int u=edge[0],v=edge[1];
            adj.get(u).add(v);
        }
        int[] color=new int[V];
        for(int i=0;i<V;i++)color[i]=-1;
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(checkBipartite(i,adj,color)==false)return false;
            }
        }
        return true;
    }
}