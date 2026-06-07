import java.io.*;

public class BlackSquare {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] cal = new int[5];
        for (int i = 1; i <= 4 ; i++) {
            cal[i] = Integer.parseInt(s[i - 1]);
        }
        String t = br.readLine();
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int idx = c - '0';
            sum += cal[idx];
        }
        System.out.println(sum);
    }
}
