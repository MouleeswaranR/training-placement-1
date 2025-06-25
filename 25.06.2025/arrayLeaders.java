import java.util.ArrayList;
import java.util.Collections;

public class arrayLeaders {
       static ArrayList<Integer> leaders(int arr[]) {
       ArrayList<Integer> ans=new ArrayList<>();
       int n=arr.length;
       int max=arr[n-1];
       ans.add(arr[n-1]);
       for(int i=arr.length-2;i>=0;i--){
           if(arr[i]>=max){
               ans.add(arr[i]);
               max=arr[i];
           }
       }
       Collections.reverse(ans);
        return ans;
    }
}
