import java.io.*;

public class BeautifulMatrix {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] matrix = new int[5][5];
		int row = 0, col = 0;

		for (int i = 0; i < 5; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = Integer.parseInt(input[j]);
				if (matrix[i][j] == 1) {
					row = i;
					col = j;
				}
			}
		}

		int moves = Math.abs(row - 2) + Math.abs(col - 2);
		System.out.println(moves);
	}
}