public class LinearSearch {
    
    public static int linearSearch(int n, int num, int []arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int arr [] = {6,7,8,4,1};
        int n = arr.length;
        int num = 4;
        System.out.println(linearSearch(n, num, arr));
    }   
}
