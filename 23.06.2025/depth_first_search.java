import java.util.*;
public class depth_first_search {
    public static void dfs(int node,List<List<Integer>> adj,boolean[] vis,List<Integer> ans){
        vis[node]=true;
        ans.add(node);
        for(int edge:adj.get(node)){
            if(!vis[edge]){
                dfs(edge,adj,vis,ans);
            }
        }
    }
    public static List<Integer> dfsTraversal(int n, List<List<Integer>> adj){
       
        List<Integer> ans=new ArrayList<>();
       
        boolean vis[]=new boolean[n+1];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                 dfs(i,adj,vis,ans);
            }
        }
        
        return ans;
           }
}


