public class NtoOne {
    public static int [] printNums(int x){
        int arr [] = new int [x];
        printDescending(arr, x, 0);
        return arr;
    }

    static void printDescending(int [] arr, int n, int i) {
        if(n <= 0) {
            return;
        }
        arr[i] = n;
        printDescending(arr, n-1, i+1);
    }
    public static void main(String[] args) {
        int arr [] = printNums(10);
        for(int a : arr) {
            System.out.print(a+" ");
        }
    }
}
