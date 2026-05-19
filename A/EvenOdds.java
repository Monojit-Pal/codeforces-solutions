import java.io.*;

public class EvenOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long n = Long.parseLong(input[0]);
        long k = Long.parseLong(input[1]);

        long oddCount = (n + 1) / 2; // Number of odd numbers from 1 to n

        if (k <= oddCount) {
            // If k is within the odd numbers
            System.out.println(2 * k - 1);
        } else {
            // If k is beyond the odd numbers, calculate the even number
            long evenIndex = k - oddCount;
            System.out.println(2 * evenIndex);
        }
    }
}
