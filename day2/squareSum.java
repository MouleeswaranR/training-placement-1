import java.util.*;
public squareSum{
    public void static main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            int temp=n%10;
            ans+=(temp*temp);
            n/=10;
        }
        System.out.println(ans);
    }
}