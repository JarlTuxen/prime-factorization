package dk.kea.dat19c.prime.Service;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    // iterative
    public void prime(int number){
        System.out.print(number + ": ");
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.print(i+" ");
                number = number/i;
            }
        }
        if(number >1) {
            System.out.print(number);
        }
        System.out.println();
    }

    public void primes(int n, int divisor, List<Integer> list){
        // 1 or 2?
        if (n <= 2) {
            if (n == 2) list.add(2);
        }
        // Non-trivial divisor
        else if (n % divisor == 0) {
            list.add(divisor);
            primes(n/divisor, divisor, list);
        }
        // Check for next divisor
        else if (divisor < n/2)
            primes(n, divisor +1, list);
            // Last divisor
        else //if (n>1)
            list.add(n);
    }

    // recursive
    public void primeDivisors(int number){

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print(number+":");
        primes(number, 2, list);
        System.out.print(list);
        System.out.println((list.size()==1)?" prime":" not prime");

    }

}
