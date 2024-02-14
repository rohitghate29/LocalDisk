//LEETCODE

public class RightShiftByKsteps {
    
    public static void reverse(int[] nums, int i, int j) {
        int li = i;
        int ri = j;
        
        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            
            li++;
            ri--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; 
        if(k < 0){ 
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int k = 3;
        for(int i: arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
        rotate(arr,k);
        for(int i: arr) {
            System.out.print(i+ " ");
        }
    }
}
