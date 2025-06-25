import java.util.HashMap;

public class countSubarrayEqualsK {
    public int countSubarrays(int arr[], int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int preSum=0;
       int count=0;
       map.put(0,1);
       for(int num:arr){
           preSum+=num;
           int rem=preSum-k;
           count+=map.getOrDefault(rem,0);
           map.put(preSum,map.getOrDefault(preSum,0)+1);
       }
        return count;
    }
}
