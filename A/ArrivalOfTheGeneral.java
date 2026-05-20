import java.io.*;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num > max) {
                max = num;
                maxIndex = i;
            }
            if (num <= min) {
                min = num;
                minIndex = i;
            }
        }
        int moves = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            moves--;
        }
        System.out.println(moves);
    }
}
