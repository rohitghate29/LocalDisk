import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class countFrequency {
    public static int[] countFreq(int n, int x, int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> i: map.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int range = sc.nextInt();
        int arr [] = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        int freq [] = countFreq(num, range, arr);
        for(int j : freq) {
            System.out.print(j +" ");
        }  
    }
}


// import java.util.HashMap;

// public class FrequencyCounter {
//     public static int[] countFrequency(int n, int x, int[] nums) {
        
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int x = 3;
//         int[] nums = {1, 2, 1, 3, 2};
//         int[] result = countFrequency(n, x, nums);

//         // Printing the result array
//         for (int i = 0; i < n; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }
// }
