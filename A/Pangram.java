import java.io.*;

public class Pangram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
