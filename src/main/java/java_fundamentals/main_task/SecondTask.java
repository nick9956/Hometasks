package java_fundamentals.main_task;


import java.util.Arrays;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) {
        if (args.length > 0) {
            List<String> list = Arrays.asList(args);

            for (String s : list) {
                String reverse = new StringBuffer(s).reverse().toString();
                System.out.println(reverse);
            }
        }
        else {
            System.out.println("Could you please enter any value in the command line");
        }
    }
}
