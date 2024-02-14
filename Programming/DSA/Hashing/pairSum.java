import java.util.ArrayList;
import java.util.List;

/**
 * pairSum
 */
public class pairSum {

    public static List<int[]> pairSum1(int[] arr, int s) {
        List<int[]> l = new ArrayList<>();
        int num[] = new int [2];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++){
                if(arr[i] + arr[j] == s){
                    num[0] = i;
                    num[1] = j;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int num = 5;
        List<int[]> m = new ArrayList<>();
        m.addAll(pairSum1(arr, num));

        for (int[] array : m) {
            // Access elements in each array
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}