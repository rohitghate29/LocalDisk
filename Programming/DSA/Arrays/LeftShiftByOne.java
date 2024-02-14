public class LeftShiftByOne {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        int result [] = new int [n];
        for(int i=1; i<n; i++) {
            result[i-1] = arr[i];
        }
        result[n-1] = temp;
        return result;
    }

    public static void main(String[] args) {
        int arr []  = {1,2,3,4,5};
        int n = arr.length;
        int result [] = rotateArray(arr, n);
        for(int i: result) {
            System.out.print(i+" ");
        }
    }
}
