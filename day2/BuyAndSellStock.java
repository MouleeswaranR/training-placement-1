import java.util.*;
public class BuyAndSellStock{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int maxProfit=Integer.MIN_VALUE;
        int mini=arr[0];
        for(int i=1;i<n;i++){
            if(mini>arr[i])mini=arr[i];
            maxProfit=Math.max(arr[i]-mini,maxProfit);
        }
        System.out.println(maxProfit);
    }
}