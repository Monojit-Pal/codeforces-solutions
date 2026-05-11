import java.io.*;

public class Bitpp {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.equals("X++") || input.equals("++X")) {
                x++;
            } else if (input.equals("X--") || input.equals("--X")) {
                x--;
            }
        }
        System.out.println(x);
    }
}
