import java.io.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int luckyDigitCount = 0;

        for (char digit : number.toCharArray()) {
            if (digit == '4' || digit == '7') {
                luckyDigitCount++;
            }
        }

        if (luckyDigitCount == 4 || luckyDigitCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
