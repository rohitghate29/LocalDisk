import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> mergedList = new ArrayList();
        int i=0, j=0;
        while(i < a.length && j<b.length) {
            if(a[i] < b[j]) {
                if(!mergedList.contains(a[i])){
                    mergedList.add(a[i]);
                }
                i++;
            } else if(b[j] < a[i]) {
                if(!mergedList.contains(b[j])){
                    mergedList.add(b[j]);
                }
                j++;
            } else { // Handling equal elements
                if (!mergedList.contains(a[i])) {
                    mergedList.add(a[i]);
                }
                i++;
                j++;
            }

            while(i < a.length) {
                if(!mergedList.contains(a[i])){
                    mergedList.add(a[i]);
                }
                i++;
            }
            
            while(j < b.length) {
                if(!mergedList.contains(b[j])){
                    mergedList.add(b[j]);
                }
                j++;
            }
        }
        return mergedList;
    }
    
    public static void main(String[] args) {
        int a [] = {1, 2, 3, 4, 6};
        int b [] = {2, 3, 5};
        int n = a.length;
        int m = b.length;
        List<Integer> result = sortedArray(a, b);
        for(int i: result) {
            System.out.print(i+" ");
        }
    }
}
