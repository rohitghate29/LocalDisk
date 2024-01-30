package Recursion;

import java.util.ArrayList;
import java.util.List;

class printNTimes {

    public static List<String> printNtimes(int n){
       return printNTimeHelper(n, new ArrayList<>());
    }

    public static List<String> printNTimeHelper(int n, List<String> name) {
        if(n > 0) {
            name.add("Coding Ninjas");
            name.addAll(printNTimeHelper(n - 1, name));
        }
        return name;
    }
    
    public static void main(String[] args) {
        List<String> result = printNtimes(4);

        // Print the result
        for (String str : result) {
            System.out.print(str + " ");
        }
    }
}
// Problem statement
// You are given an integer ‘n’.
// Print “Coding Ninjas ” ‘n’ times, without using a loop.

// Example:
// Input: ‘n’  = 4
// Output:
// Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas 

// Explanation: “Coding Ninjas” is printed 4 times. 