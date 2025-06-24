import java.util.*;
//gfg
class find_eventual_safe_states {
    public boolean check(int node,List<List<Integer>> adj,int[] vis,int[] pathVis,int[] check){
        vis[node]=1;
        pathVis[node]=1;
        check[node]=0;
        for(int adjNode:adj.get(node)){
            if(vis[adjNode]==0){
                if(check(adjNode,adj,vis,pathVis,check))return true;
                
            }else if(pathVis[adjNode]==1){
                return true;
            }
        }
        pathVis[node]=0;
        check[node]=1;
        return false;
    }
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        int[] vis=new int[V];
        int[] pathVis=new int[V];
        int[] check=new int[V];
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                  check(i,adj,vis,pathVis,check);
            }
          
        }
        
        List<Integer> safe=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(check[i]==1) safe.add(i);
        }
        return safe;
    }
}
