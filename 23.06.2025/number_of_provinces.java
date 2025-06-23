import java.util.ArrayList;
// gfg problem
public class number_of_provinces {
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[node]=true;
        for(int edge:adj.get(node)){
            if(!vis[edge]){
                dfs(edge,adj,vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> isConnected, int V) {
       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<Integer>());
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected.get(i).get(j)==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
        boolean[] vis=new boolean[V+1];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
}; 
