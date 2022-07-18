import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the input string");
        String string = scanner.nextLine();

        int lengthOfString = string.length();
        System.out.println("This string has " + lengthOfString + " characters.");
    }
}
