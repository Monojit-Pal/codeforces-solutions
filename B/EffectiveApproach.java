import java.io.*;

public class EffectiveApproach {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] pos = new int[n + 1];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            pos[Integer.parseInt(s[i])] = i + 1;
        }
        int m = Integer.parseInt(br.readLine());
        String[] q = br.readLine().split(" ");
        long a = 0, b = 0;
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(q[i]);
            a += pos[x];
            b += n - pos[x] + 1;
        }
        System.out.println(a + " " + b);
    }
}
