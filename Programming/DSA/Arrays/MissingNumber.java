public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int rangeSum = n * (n+1)/2;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return rangeSum - sum;
    }

    public static void main(String[] args) {
        int nums [] = {3,0,1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
    
}
