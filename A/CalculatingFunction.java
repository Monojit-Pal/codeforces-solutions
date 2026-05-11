import java.io.*;

public class CalculatingFunction {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = (n % 2 == 0) ? (n / 2) : (-(n + 1) / 2);
        System.out.println(result);
    }
}
