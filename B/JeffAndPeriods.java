import java.io.*;
import java.util.*;

public class JeffAndPeriods {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i + 1);
        }
        List<int[]> ans = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            if (list.size() == 1) {
                ans.add(new int[]{entry.getKey(), 0});
            } else {
                int diff = list.get(1) - list.get(0);
                boolean valid = true;
                for (int i = 2; i < list.size(); i++) {
                    if (list.get(i) - list.get(i - 1) != diff) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ans.add(new int[]{entry.getKey(), diff});
                }
            }
        }
        Collections.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(ans.size());
        for (int[] pair : ans) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
