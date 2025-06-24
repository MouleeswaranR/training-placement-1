import java.util.*;

public class merge_sorted_arrays {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list = new ArrayList<Integer>();
        int size1 = a.length;
        int size2 = b.length;
        int i=0;
        int j=0;
        while(i<size1 && j<size2){ 
            if(a[i]<b[j]){ 
                addUnique(list, a[i]);
                i++;
            }
            else if(a[i]==b[j]){ 
               addUnique(list, a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]){ 
                addUnique(list, b[j]);
                j++;
            }
        }
         while(i<size1){ 
            addUnique(list, a[i]);
            i++;
        }
        while(j<size2){
            addUnique(list, b[j]);
            j++;
        }
        return list;
    }

 

private static void addUnique(List<Integer> list, int num) {

        if (list.size() == 0 || list.get(list.size() - 1) != num) {
            list.add(num);
        }
    }
}