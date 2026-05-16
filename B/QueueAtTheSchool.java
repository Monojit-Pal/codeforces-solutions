import java.io.*;;

public class QueueAtTheSchool {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        String queue = br.readLine();

        for (int i = 0; i < t; i++) {
            StringBuilder newQueue = new StringBuilder(queue);
            for (int j = 0; j < n - 1; j++) {
                if (queue.charAt(j) == 'B' && queue.charAt(j + 1) == 'G') {
                    newQueue.setCharAt(j, 'G');
                    newQueue.setCharAt(j + 1, 'B');
                    j++; // Skip the next position since we just swapped
                }
            }
            queue = newQueue.toString();
        }

        System.out.println(queue);
    }
}