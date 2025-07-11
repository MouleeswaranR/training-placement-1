import java.util.*;
public class NthNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<String> queue=new LinkedList<>();
        queue.offer("3");
        queue.offer("4");
        int count=0;
        while(!queue.isEmpty()){
            String curr=queue.poll();
            count++;
            if(count==n){
                System.out.println(curr);

            }
            queue.offer(curr+"3");
            queue.offer(curr+"4");
        }
        sc.close();
    }
}
