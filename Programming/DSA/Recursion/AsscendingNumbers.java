// Problem statement
// You are given an integer ‘n’.
// Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.

// Example:
// Input: ‘n’ = 5
// Output: 1 2 3 4 5

// Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
package Recursion;

public class AsscendingNumbers {
    
    public static int [] printNos(int x) {
        int arr [] = new int [x];
        oneToN(arr, x);
        return arr;
    }

    static void oneToN(int arr[], int x) {
        if(x <=0) {
            return;
        }
        arr[x-1] = x;
        oneToN(arr, x-1);
    }
    
    public static void main(String[] args) {
        int num = 9;
        int aa []= printNos(num);
        for(int i=0; i<aa.length; i++) {
            System.out.print(aa[i]);
        }
    }
}
