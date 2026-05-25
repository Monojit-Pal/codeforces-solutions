import java.io.*;

public class Taxi {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] c = new int[5];
        for (int i = 0; i < n; i++) {
            c[Integer.parseInt(input[i])]++;
        }
        int taxis  = 0;
        taxis += c[4];
        taxis += c[3];
        c[1] -= Math.min(c[1], c[3]);
        taxis += c[2] / 2;
        if (c[2] % 2 == 1) {
            taxis++;
            c[1] -= Math.min(c[1], 2);
        }
        if (c[1] > 0) {
            taxis += (c[1] + 3) / 4;
        }
        System.out.println(taxis);
    }
}
