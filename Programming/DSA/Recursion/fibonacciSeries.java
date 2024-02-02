public class fibonacciSeries {
    // Optimized Approach
    public static int [] fibonacciNums(int n) {
        if(n==0){
            return new int[0];
        }

        int arr [] = new int[n];
        arr[0] = 0;
        if(n>1){
            arr[1] = 1;
        }

        for(int i=2; i<n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int num = 5;
        int arr [] = new int[num];
        arr = fibonacciNums(num);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// Brute force Approch
// public static int[] generateFibonacciNumbers(int n) {
//     int arr [] = new int [n];
//     int i = 0;
//     while(n > 0) {
//         arr[i] = fib(i);
//         n -= 1;
//         i++;
//     }
//     return arr;
// }

// public static int fib(int n) {
//     if(n == 0 || n == 1) {
//         return n;
//     } else {
//         return fib(n-1) + fib(n-2);
//     }
// }