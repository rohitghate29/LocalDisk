class PrimeNumberCheck {
    
    public static String isPrime(int num) {
        if(num <= 1) return "NO";

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        int num = 11;
        String isPrime = isPrime(num);
        System.out.println(isPrime);
    }
}