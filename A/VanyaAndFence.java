import java.io.*;

public class VanyaAndFence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        int count = 0;
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(input[i]) > h) {
                count += 2;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
