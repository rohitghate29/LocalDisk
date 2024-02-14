// You are given a sorted integer array 'arr' of size 'n'.
// You need to remove the duplicates from the array such that each element appears only once.
// Return the length of this new array.

// Note:
// Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory. 

// For example:
// 'n' = 5, 'arr' = [1 2 2 2 3].
// The new array will be [1 2 3].
// So our answer is 3.

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr,int n) {
        int count = 0;
        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            }
        }
        int result = n - count;
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,5,5}; 
        int n = arr.length;
        System.out.println(removeDuplicates(arr, n));
    }
}
