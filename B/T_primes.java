import java.io.*;

public class T_primes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        String[] primes = new String[n];
        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(numbers[i]);
            if (isTPrime(x)) {
                primes[i] = "YES";
            } else {
                primes[i] = "NO";
            }
        }
        for (String prime : primes) {
            System.out.println(prime);
        }
    }
    private static boolean isTPrime(long x) {
        if (x < 2) {
            return false;
        }
        long sqrt = (long) Math.sqrt(x);
        return sqrt * sqrt == x && isPrime(sqrt);
    }
    private static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
