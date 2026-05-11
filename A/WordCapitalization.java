import java.io.*;

public class WordCapitalization {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char firstLetter = word.charAt(0);
        if (firstLetter >= 'a' && firstLetter <= 'z') {
            firstLetter = (char) (firstLetter - ('a' - 'A'));
        }
        System.out.println(firstLetter + word.substring(1));
    }
}
