import java.util.HashSet;

public class maxConsecutiveSequence {
     public int longestConsecutive(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        
        int longest=1;
        for(int ele:set){
            if(!set.contains(ele-1)){
                int cnt=1;
                int num=ele;
                while(set.contains(num+1)){
                    num=num+1;
                    cnt+=1;
                }
                longest=Math.max(cnt,longest);
            }
        }
        return longest;
    }
}
