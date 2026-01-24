// more consistent solution (sieve)
// sieve of eratosthenes
class  Prime_no_range{

    public static void printPrimes(int n) {

        boolean[] isPrime = new boolean[n + 1];

        // Step 1: Assume all numbers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Sieve logic
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {

                // Mark multiples of i as not prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Print primes
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 30;
        printPrimes(n);
    }
}
