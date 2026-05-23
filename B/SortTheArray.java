import java.io.*;

public class SortTheArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int start = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }
        if (start == -1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }
        int end = start;
        for (int i = start; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                end = i + 1;
            } else {
                break;
            }
        }
        reverse(arr, start, end);
        if (isSorted(arr)) {
            System.out.println("yes");
            System.out.println((start + 1) + " " + (end + 1));
        } else {
            System.out.println("no");
        }
    }

    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    private static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}