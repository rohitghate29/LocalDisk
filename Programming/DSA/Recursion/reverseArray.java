import java.util.Scanner;

public class reverseArray {
    
    public static int [] ReverseArray(int n, int arr[]){
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0, j=arr.length-1, temp;
        while(i<j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0; k<arr.length; k++) {
            System.out.print(arr[k]);
        }   
    }
}
