import java.io.*;

public class Koshary {
    public static boolean canReach(int x, int y) {
        if ((x % 2 == 1) && (y % 2 == 1)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] x = new int[t];
        int[] y = new int[t];
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] parts = s.split(" ");
            x[i] = Integer.parseInt(parts[0]);
            y[i] = Integer.parseInt(parts[1]);
        }
        boolean[] result = new boolean[t];
        for (int i = 0; i < t; i++) {
            result[i] = canReach(x[i], y[i]);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i] ? "YES" : "NO");
        }
    }
}