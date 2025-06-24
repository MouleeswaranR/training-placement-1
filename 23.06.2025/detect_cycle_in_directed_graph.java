import java.util.*;

class Solution {
    public boolean checkCycle(int node,List<List<Integer>> adj,int[] vis,int[] pathVis){
        vis[node]=1;
        pathVis[node]=1;
        for (int adjNode : adj.get(node)) {
            if (vis[adjNode] == 0) {
                if (checkCycle(adjNode, adj, vis, pathVis)) return true;
            } else if (pathVis[adjNode] == 1) {
                return true; 
            }
        }
        pathVis[node]=0;
        return false;
    }
    public boolean detect_cycle_in_directed_graph(int V, int[][] edges) {
         List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj.get(u).add(v); 
        }
        int[] vis=new int[V];
        int[] pathVis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
               if(checkCycle(i,adj,vis,pathVis)){
                   return true;
               }
            }
        }
        return false;
    }
}