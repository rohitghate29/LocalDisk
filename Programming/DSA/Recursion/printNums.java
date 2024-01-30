package Recursion;

class printNums {
    static int count = 0;
    static void naturalNums(int x) {
        if(count == x) {
            return;
        } 
        count += 1;
        System.out.print(count+ " ");

        naturalNums(x);
    }
    
    public static void main(String[] args) {
        int num = 15;
        naturalNums(num); 
    }
}