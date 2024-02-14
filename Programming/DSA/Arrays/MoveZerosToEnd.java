import java.util.Scanner;

public class MoveZerosToEnd {
    
    public static int[] moveZeros(int n, int []a) {
        int nz = 0, z = 0;
        if(n == 0 || n == 1) {
            return a;
        }
        while(nz < n) {
            if(a[nz] != 0) {
                int temp = a[nz];
                a[nz] = a[z];
                a[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr [] = {1,2,0,0,2,3};
        int n = arr.length;
        int moved [] = moveZeros(n, arr);
        for (int i = 0; i < moved.length; i++) {
            System.out.print(moved[i]+" ");
        }
    }
}
