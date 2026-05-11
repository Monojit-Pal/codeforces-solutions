import java.io.*;

public class BoyOrGirl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        boolean[] seen = new boolean[26];
        int uniqueChars = 0;

        for (int i = 0; i < name.length(); i++) {
            int idx = name.charAt(i) - 'a';
            if (!seen[idx]) {
                seen[idx] = true;
                uniqueChars++;
            }
        }

        if (uniqueChars % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}