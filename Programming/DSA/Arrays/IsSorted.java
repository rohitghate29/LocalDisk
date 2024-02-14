public class IsSorted {
    
    public static int isSorted(int [] arr, int n) {
        int result = 1;
        for(int i=0; i<n-1; i++) {
            int j=i+1;
            if(arr[j] < arr[i] ) {
                result = 0;
            } 
        }
        return result;
    }
    
    public static void main(String[] args) {
        int arr [] = {0,0,0,1};
        int n = arr.length;
        System.out.println(isSorted(arr,n));
    }
}
