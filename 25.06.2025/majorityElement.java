class majorityElement {
    static int majorityElement(int arr[]) {
        // code here
        int ele=0,cnt=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                ele=arr[i];
                cnt++;
            }else if(arr[i]==ele){
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele)cnt1++;
        }
        if(cnt1>(arr.length/2)) return ele;
        return -1;
    }
}