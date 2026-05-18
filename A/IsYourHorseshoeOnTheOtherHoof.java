import java.io.*;
import java.util.HashSet;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] shoes = new int[4];
        for (int i = 0; i < 4; i++) {
            shoes[i] = Integer.parseInt(input[i]);
        }
        int count = 0;
        HashSet<Integer> uniqueShoes = new HashSet<>();
        for (int shoe : shoes) {
            if (!uniqueShoes.add(shoe)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
