class maxConsecutiveCount {
    public int maxConsecutiveCount(int[] arr) {
        int n=arr.length;
        int one=0,zero=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                one++;
                 max=Math.max(max,Math.max(one,zero));
                zero=0;
              
            }else{
                zero++;
                max=Math.max(max,Math.max(one,zero));
                one=0;
               
            }
        }
        return max;
    }
}
