import java.io.*;

public class IQTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int evenCount = 0;
        int oddCount = 0;
        int evenIndex = -1;
        int oddIndex = -1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (num % 2 == 0) {
                evenCount++;
                evenIndex = i + 1; // Store 1-based index
            } else {
                oddCount++;
                oddIndex = i + 1; // Store 1-based index
            }
        }

        if (evenCount == 1) {
            System.out.println(evenIndex);
        } else {
            System.out.println(oddIndex);
        }
    }
}
