import java.io.*;

public class SerajaAndDima {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(input[i]);
        }

        int seraja = 0, dima = 0;
        int left = 0, right = n - 1;
        boolean serajaTurn = true;

        while (left <= right) {
            int chosen;
            if (cards[left] > cards[right]) {
                chosen = cards[left];
                left++;
            } else {
                chosen = cards[right];
                right--;
            }

            if (serajaTurn) {
                seraja += chosen;
            } else {
                dima += chosen;
            }
            serajaTurn = !serajaTurn;
        }

        System.out.println(seraja + " " + dima);
    }
}
