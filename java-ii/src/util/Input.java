package util;
import java.util.Scanner;

public final class Input {

    // Variables/Fields
    private static Scanner scanner = new Scanner(System.in);


    // Methods
    public static String getString(String... prompt){
        if (prompt.length > 0) { System.out.print("Gimme a string: "); }
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static boolean yesNo(String... prompt){
        if (prompt.length > 0) { System.out.print("Want a boolean? (y/n): "); }
        scanner.nextLine();
        return (scanner.nextLine().toLowerCase().startsWith("y"));
    }

    public static int getInt(int min, int max, String... prompt) {
        int userInput;
        do  {
            if (prompt.length > 0) { System.out.print("Gimme an integer between " + min + " and " + max + ": "); }
            userInput = scanner.nextInt();
        } while (userInput > max || userInput < min);
        return userInput;
    }

    public static int getInt(String... prompt) {
        if (prompt.length > 0) { System.out.print("Gimme an integer: "); }
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max, String... prompt) {
        double userInput;
        do  {
            if (prompt.length > 0) { System.out.print("Gimme a double between " + min + " and " + max + ": "); }
            userInput = scanner.nextDouble();
        } while (userInput > max || userInput < min);
        return userInput;
    }

    public static double getDouble(String... prompt) {
        if (prompt.length > 0) { System.out.print("Gimme a double: "); }
        return scanner.nextDouble();
    }
}
