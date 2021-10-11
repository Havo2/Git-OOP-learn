public class Primes {
    public static void main(String[] args) {
        for (int m = 2; m < 101; m++) {
            if (isPrime(m) == false)
                continue;
            System.out.println(m + "- простое число");
        }
    }
    public static boolean isPrime(int n)
    {
        for (int k = 2; k < n; k++) {
            if (n % k == 0)
                return false;
        }
        return true;
    }
}
