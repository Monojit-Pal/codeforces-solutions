import java.io.*;

public class PartyMonster {
    public static boolean isRegular(int n, String s) {
        int bal = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                bal++;
            } else {
                bal--;
            }
        }
        return bal == 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean[] result = new boolean[t];
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            result[i] = isRegular(n, s);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i] ? "YES" : "NO");
        }
    }
}