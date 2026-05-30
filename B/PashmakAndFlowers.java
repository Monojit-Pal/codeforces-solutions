import java.io.*;

public class PashmakAndFlowers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] flowers = new int[n];
        for (int i = 0; i < n; i++) {
            flowers[i] = Integer.parseInt(input[i]);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long countMin = 0;
        long countMax = 0;
        for (int flower : flowers) {
            if (flower < min) {
                min = flower;
                countMin = 1;
            } else if (flower == min) {
                countMin++;
            }
            if (flower > max) {
                max = flower;
                countMax = 1;
            } else if (flower == max) {
                countMax++;
            }
        }
        long pairs;
        if (min == max) {
            pairs = countMin * (countMin - 1) / 2;
        } else {
            pairs = countMin * countMax;
        }
        System.out.println((max - min) + " " + pairs);
    }
}
