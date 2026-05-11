import java.io.*;

public class Magnets {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] magnets = new int[n];
        for (int i = 0; i < n; i++) {
            magnets[i] = Integer.parseInt(br.readLine());
        }
		int grp = 1;
		int pre = magnets[0];
		for (int i = 1; i < n; i++) {
			if (pre != magnets[i]) {
				pre = magnets[i];
				grp++;
			}
		}
		System.out.println(grp);
	}
}
