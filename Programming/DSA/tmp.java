class tmp {
    public static String isPrime(int num) {
            for(int i=2; i<=Math.sqrt(num); i++) {
                if(num <= 1 ) {
                    return "NO";
                }
                if(num % i == 0) {
                    return "NO";
                }
            }
            return "YES";
        }
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}