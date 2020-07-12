package java_fundamentals.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FourthTask {
    public static void main(String[] args) throws IOException {

        int sum = 0;
        int multiply = 1;

        System.out.println("Could you please enter numbers with the space between numbers and comma separated?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String reader = br.readLine();
            String[] sep = reader.split(", ");
            for (String s : sep) {
                int numbers = Integer.parseInt(s);
                sum += numbers;
                multiply *= numbers;
            }
            System.out.println(sum);
            System.out.println(multiply);
        }
        catch (NumberFormatException e) {
            System.err.println("Please re-launch the program and enter numbers with the space between numbers and comma separated!");
        }
    }
}
