import java.io.*;

public class PoliceRecruits {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int police = 0, untreated = 0;
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(input[i]);
			if (num == -1) {
				if (police > 0) {
                    police--;
                } else {
                    untreated++;
                }
			} else {
				police += num;
			}
   		}
		System.out.println(untreated);
	}
}