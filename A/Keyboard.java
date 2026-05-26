import java.io.*;

public class Keyboard {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        String s = br.readLine();
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int idx = keyboard.indexOf(ch);
            if (c == 'R') {
                sb.append(keyboard.charAt(idx - 1));
            } else {
                sb.append(keyboard.charAt(idx + 1));        
            }
        }
        System.out.println(sb.toString());
    }
}
