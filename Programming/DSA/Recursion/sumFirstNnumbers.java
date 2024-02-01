public class sumFirstNnumbers {
    public static long sumFirstN(long n) {
        long sum = 0;
        sum = sumHelper(n, sum);
        return sum;
    }

    static long sumHelper(long x, long sum) {
        if(x > 0){
            sum = sum + x;
            return sumHelper(x - 1, sum);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(sumFirstN(5));
    }
}
