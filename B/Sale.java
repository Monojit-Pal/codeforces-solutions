import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sale {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            prices[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(prices);
        int totalCost = 0;
        for (int i = 0; i < m; i++) {
            if (prices[i] < 0) {
                totalCost -= prices[i];
            } else {
                break;
            }
        }
        System.out.println(totalCost);
    }
}