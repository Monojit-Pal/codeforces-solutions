import java.io.*;

public class Elephant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int steps = 0;
        while (n >= 5) {
            n -= 5;
            steps++;
        }
        while (n >= 4) {
            n -= 4;
            steps++;
        }
        while (n >= 3) {
            n -= 3;
            steps++;
        }
        while (n >= 2) {
            n -= 2;
            steps++;
        }
        while (n >= 1) {
            n -= 1;
            steps++;
        }
        System.out.println(steps);
    }
}
