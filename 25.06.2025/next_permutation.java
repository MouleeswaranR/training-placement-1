public class next_permutation {
    void nextPermutation(int[] arr) {
        int ind1=-1,ind2=-1,n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
            reverse(arr,0);
            return;
        }else{
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[ind1]){
                    ind2=i;
                    break;
                }
            }
             swap(arr,ind1,ind2);
        reverse(arr,ind1+1);
        }
       
        
    }
    public void reverse(int[] nums,int start){
        int i=start,j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
   public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
