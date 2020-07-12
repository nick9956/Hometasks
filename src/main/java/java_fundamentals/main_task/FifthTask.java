package java_fundamentals.main_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Could you please enter number of the month?");
        try {
            int month = scan.nextInt();
            String monthString;
            switch (month) {
                case 1:
                    monthString = "January";
                    break;
                case 2:
                    monthString = "February";
                    break;
                case 3:
                    monthString = "March";
                    break;
                case 4:
                    monthString = "April";
                    break;
                case 5:
                    monthString = "May";
                    break;
                case 6:
                    monthString = "June";
                    break;
                case 7:
                    monthString = "July";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "September";
                    break;
                case 10:
                    monthString = "October";
                    break;
                case 11:
                    monthString = "November";
                    break;
                case 12:
                    monthString = "December";
                    break;
                default:
                    monthString = "You enter no month number";
                    break;
            }
            System.out.println(monthString);
        } catch (InputMismatchException e) {
            System.err.println("Please re-launch the program and enter a number!");
        }
    }
}
