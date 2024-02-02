import java.util.HashMap;
import java.util.Scanner;

class countFrequency {
    public static int[] countFreq(int n, int x, int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(i+1)){
                nums[i]=map.get(i+1);
            }else{
                nums[i]=0;
            }
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