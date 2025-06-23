import java.util.*;
public class breadth_first_search {
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
       
        List<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[n+1];
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int edge:adj.get(node)){
                if(!vis[edge]){
                    vis[edge]=true;
                    q.add(edge);
                }
            }
        }
        return ans;
           }
}

