import java.io.*;

public class Borze {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ans = ""; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                char ch = s.charAt(i + 1);
                if (ch == '.') {
                    ans += "1"; 
                } else if (ch == '-') {
                    ans += "2"; 
                }
                i++; 
            } else if (c == '.') {
                ans += "0"; 
            }
        }
        System.out.println(ans); 
    }
}