import java.util.ArrayList;
import java.util.List;

public class factorialNotGreaterThanN {
    

    public static List<Long> factorialNumbers(long n) {
        List<Long> factVals = new ArrayList<>();
        long multiple = 1;
        long i = 1;
        factorialNumbers(n, factVals, multiple, i);
        return factVals;
    }
    
    static void factorialNumbers(long n, List<Long> L, long multiple, long i) {
        multiple = multiple * i;
        if(multiple <= n) {
            L.add(multiple);
            factorialNumbers(n,L,multiple,++i);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(24));
    }
}

