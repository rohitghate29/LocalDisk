public class SecondLargest {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int small = Integer.MAX_VALUE;
        int SecondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int SecondLarge = Integer.MIN_VALUE;
        int i;

        for(i=0; i<n; i++) {
            small = Math.min(small,a[i]);
            large = Math.max(large,a[i]);
        }

        for(i=0;i<n;i++) {
            if(a[i] < SecondSmall && a[i] != small) {
                SecondSmall = a[i];
            }else if(a[i] > SecondLarge && a[i] != large) {
                SecondLarge = a[i];
            }
        }
        int result [] = {SecondLarge, SecondSmall};
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {9,2,4,6,8,9,9,9,10};
        int n = arr.length;
        int ele[] = getSecondOrderElements(n, arr);
        for(int i : ele) {
            System.out.print(i+" ");
        }
    }
}