import java.io.*;

public class PetyaAndStrings {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstString = reader.readLine().toLowerCase();
        String secondString = reader.readLine().toLowerCase();

        int result = firstString.compareToIgnoreCase(secondString);
        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
