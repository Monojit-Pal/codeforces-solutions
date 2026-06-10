import java.io.*;
import java.util.HashSet;

public class AntonAndLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashSet<Character> unique = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c != '{' && c != '}' && c != ',' && c != ' ') {
                unique.add(c);
            }
        }
        System.out.println(unique.size());
    }
}
