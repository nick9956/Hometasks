package java_fundamentals.main_task;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Could you please enter your name?");
        String userName = scan.nextLine();
        System.out.printf("Hi %s!", userName);
        scan.close();

    }
}