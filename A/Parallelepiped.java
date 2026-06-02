import java.io.*;

public class Parallelepiped {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a1 = Integer.parseInt(input[0]);
        int a2 = Integer.parseInt(input[1]);
        int a3 = Integer.parseInt(input[2]);
        int x = (int)Math.sqrt((a1 * a2) / a3);
        int y = (int)Math.sqrt((a1 * a3) / a2);
        int z = (int)Math.sqrt((a2 * a3) / a1);
        System.out.println(4 * (x + y + z));
    }
}