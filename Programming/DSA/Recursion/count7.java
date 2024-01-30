public class count7 {

    public static int countNum(int n, int count) {
        count = 0;
        if(n > 0) {
            int digit = n % 10;
            if(digit == 7) {
                count++;
            }
            return count + countNum(n/10, count);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countNum(77272717, 0));
    }
}
