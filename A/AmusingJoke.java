import java.io.*;

public class AmusingJoke {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int[] count = new int[26];
        for (char c : s1.toCharArray()) {
            count[c - 'A']++;
        }
        for (char c : s2.toCharArray()) {
            count[c - 'A']++;
        }
        for (char c : s3.toCharArray()) {
            count[c - 'A']--;
        }
        boolean isAmusing = true;
        for (int i : count) {
            if (i != 0) {
                isAmusing = false;
                break;
            }
        }
        System.out.println(isAmusing ? "YES" : "NO");
    }
}
