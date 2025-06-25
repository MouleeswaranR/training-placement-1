class missingNum {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        int x1=0,x2=0;
        for(int i=0;i<=n;i++){
            x1^=i;
        }
        for(int i=0;i<arr.length;i++){
            x2^=arr[i];
        }
        return x1^x2;
    }
}