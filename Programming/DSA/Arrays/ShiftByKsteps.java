import java.util.ArrayList;
import java.util.List;

public class ShiftByKsteps {
    
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<arr.size(); i++) {
            int val = arr.get((i+k) % arr.size());
            nums.add(val); 
        }
        return nums;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            arr.add(i);
        }
        int k = 3;
        System.out.println(arr);
        ArrayList<Integer> rotated = rotateArray(arr, k);
        System.out.println(rotated);
    }
}
