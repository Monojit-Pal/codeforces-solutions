import java.io.*;
import java.util.*;

public class Lecture {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        Map<String, String> best = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            String[] words = br.readLine().split(" ");
            if (words[0].length() <= words[1].length()) {
                best.put(words[0], words[0]);
            } else {
                best.put(words[0], words[1]);
            }
        }
        
        String[] lec = br.readLine().split(" ");
        
        StringBuilder notes = new StringBuilder();
        for (int i = 0; i < n; i++) {
            notes.append(best.get(lec[i]));
            if (i < n - 1) {
                notes.append(" ");
            }
        }
        
        System.out.println(notes);
    }
}
