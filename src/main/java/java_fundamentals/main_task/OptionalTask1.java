package java_fundamentals.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionalTask1 {
    public static void main(String[] args) {

        System.out.println("Could you please enter numbers with the space between numbers and comma separated?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String reader = br.readLine();
            String[] sep = reader.split(", ");

            //2nd
            String longNumber = "", shortNumber = reader;

            for (String value : sep) {
                Integer.parseInt(value);
                if (value.length() > longNumber.length()) longNumber = value;
                if (value.length() < shortNumber.length()) shortNumber = value;
            }
            System.out.printf("The longest word: %s  Length: %s\n", longNumber, longNumber.length());
            System.out.printf("The shortest word: %s  Length: %s\n", shortNumber, shortNumber.length());

            //1st
            boolean isSorted = false;
            while(!isSorted){
                isSorted = true;
                for(int i = 1; i < sep.length; i++) {
                    if(sep[i].length() < sep[i-1].length()) {
                        String temp = sep[i];
                        sep[i] = sep[i-1];
                        sep[i-1] = temp;
                        isSorted=false;
                    }
                }
            }

           for(String str1 : sep){
                System.out.println(str1); }

           //3rd
           double avg = 0;

            for (String str3 : sep) {
                avg += str3.length();
            }

            if (sep.length > 0) avg /= sep.length;
            System.out.printf("Average length of numbers entered: %.2f\n", avg);
            System.out.println("Numbers longer than average:");
            for (String str3 : sep) {
                if (str3.length() > avg) System.out.println(str3 + " Length: " + str3.length());
            }
            System.out.println("Numbers shorter than average:");
            for (String str3 : sep) {
                if (str3.length() < avg) System.out.println(str3 + " Length: " + str3.length());
            }

        } catch (NumberFormatException e) {
            System.err.println("Please re-launch the program and enter numbers with the space between numbers and comma separated!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
