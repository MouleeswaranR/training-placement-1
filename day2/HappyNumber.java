import java.util.*;
public HappyNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cycle=0;
        int temp=n;
        while(cycle<=10 && temp!=1){
           int num=0;
           int temp1=temp%10;
           num+=(temp1*temp1);
           n/=10;
           cycle++;
           temp=num;
        }
        System.out.println(cycle);
    }
}