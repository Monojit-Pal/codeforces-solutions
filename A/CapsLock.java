import java.io.*;

public class CapsLock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean capsLockOn = false;

        boolean allCaps = true;
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                allCaps = false;
                break;
            }
        }
        boolean firstCaps = false;
        if (input.length() > 0 && Character.isUpperCase(input.charAt(0))) {
            firstCaps = true;
            for (int i = 1; i < input.length(); i++) {
                if (Character.isLowerCase(input.charAt(i))) {
                    firstCaps = false;
                    break;
                }
            }
        }
        if (allCaps || firstCaps) {
            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            }
            System.out.println(result.toString());
        } else {
            System.out.println(input);
        }
    }
}
