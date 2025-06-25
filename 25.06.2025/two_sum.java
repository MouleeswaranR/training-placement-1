import java.util.HashMap;
class two_sum {
    boolean twoSum(int arr[], int target) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int rem=target-arr[i];
            if(map.containsKey(rem)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
}