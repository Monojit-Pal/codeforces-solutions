import java.io.*;

public class WayTooLongWords {
	public static String makeAbbreviation (String str) {
		String newS =  "" + str.charAt(0) + (str.length() - 2) + str.charAt(str.length() - 1);
		return newS;
	}

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = br.readLine();
		}
		for (String word : words) {
            if (word.length() <= 10) {
                System.out.println(word);
            } else {
			    System.out.println(makeAbbreviation(word));
            }
		}
	}
}