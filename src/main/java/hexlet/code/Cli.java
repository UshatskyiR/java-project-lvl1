package hexlet.code;
import java.util.Scanner;
public class Cli {

    public static String askName() {
        Scanner nameAsk = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = nameAsk.nextLine();
        return ("Hello, " + name + "!");
    }
}


