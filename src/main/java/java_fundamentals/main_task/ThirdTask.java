package java_fundamentals.main_task;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ThirdTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Could you please enter number of random numbers?");

        int numbersAmount = 0;
        try {
            numbersAmount = scan.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Please re-launch the program and enter a number!");
        }

        for (int i = 0; i < numbersAmount; i++) {
            int num = random.nextInt(1000);
            list.add(num);
        }
        for (int numbers : list) {
            System.out.println(numbers);
        }
        for (int numbers : list) {
            System.out.print(numbers + " ");
        }
    }
}
