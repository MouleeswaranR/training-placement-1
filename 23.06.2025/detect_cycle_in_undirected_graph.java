import java.util.*;
//leetcode,gfg
class Pair{
    int node,parent;
    public Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}

class detect_cycle_in_undirected_graph {
    public boolean checkCycle(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[node]=true;
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(node,-1));
        while(!queue.isEmpty()){
            int currnode=queue.peek().node;
            int currparent=queue.peek().parent;
            queue.remove();
            for(int adjNode:adj.get(currnode)){
                if(!vis[adjNode]){
                    vis[adjNode]=true;
                    queue.add(new Pair(adjNode,currnode));
                }else if(adjNode!=currparent){
                    return true;
                }
            }
          
        }
          return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int[] edge:edges){
            int u=edge[0],v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(checkCycle(i,adj,vis))return true;
            }
        }
        return false;
    }
}