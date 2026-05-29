import java.io.*;

public class Dubstep {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replaceAll("WUB", " ").trim();
        System.out.println(s);
    }
}
