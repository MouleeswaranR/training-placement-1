
class check_if_array_is_sorted {
    public boolean arraySortedOrNot(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}