import java.io.*;

public class Drinks {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(arr[i]);
        }
        System.out.println(sum / n);
    }
}