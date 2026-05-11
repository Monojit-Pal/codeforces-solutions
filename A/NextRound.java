import java.io.*;

public class NextRound {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] scores = new int[n];
        String[] parts = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(parts[i]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >= scores[k - 1] && scores[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
