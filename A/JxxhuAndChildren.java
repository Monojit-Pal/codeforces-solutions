import java.io.*;
import java.util.*;

public class JxxhuAndChildren {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] children = new int[n];
        String[] childrenInput = br.readLine().split(" ");
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            children[i] = Integer.parseInt(childrenInput[i]);
            queue.add(new int[]{children[i], i + 1});
        }
        int lastChild = -1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            current[0] -= m;
            if (current[0] > 0) {
                queue.add(current);
            } else {
                lastChild = current[1];
            }
        }
        System.out.println(lastChild);
    }
}
