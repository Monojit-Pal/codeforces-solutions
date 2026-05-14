import java.io.*;

public class Tram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxPassengers = 0;
        int currentPassengers = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int passengersOut = Integer.parseInt(input[0]);
            int passengersIn = Integer.parseInt(input[1]);

            currentPassengers -= passengersOut;
            currentPassengers += passengersIn;

            if (currentPassengers > maxPassengers) {
                maxPassengers = currentPassengers;
            }
        }

        System.out.println(maxPassengers);
    }
}
