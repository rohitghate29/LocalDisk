public class sumFirstNnumbers {
    public static long SumN(long n) {
        long sum = n * (n+1) / 2;
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(SumN(5));
    }
}
