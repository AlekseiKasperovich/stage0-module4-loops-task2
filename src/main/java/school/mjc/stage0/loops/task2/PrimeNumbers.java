package school.mjc.stage0.loops.task2;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        List<Integer> primes = new ArrayList<>();
        if (printToInclusive > 1) {
            primes.add(2);
            System.out.println(2);
        }
        int i = 3;
        while (i <= printToInclusive) {
            if (isPrime(i, primes)) {
                primes.add(i);
                System.out.println(i);
            }
            i += 2;
        }
    }

    public static boolean isPrime(int n, List<Integer> primes) {
        int i = 0;
        while (i < primes.size()) {
            int prime = primes.get(i);
            if (prime * prime > n) {
                return true;
            }
            if (n % prime == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
