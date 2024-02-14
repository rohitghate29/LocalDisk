class LargestElement {

    public static int largestElement(int arr[], int n) {
        int max = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr [] = {4,7,8,6,7,6};
        int n = 5;

        int largest = largestElement(arr,n);
        System.out.println(largest);
    }
}