package util;
import java.util.Scanner;

public final class Input {

    // Variables/Fields
    private static Scanner scanner = new Scanner(System.in);


    // Methods
    public static String getString(String... prompt){
        if (prompt.length > 0) { System.out.print("Gimme a string: "); }
        return scanner.nextLine();
    }

    public static boolean yesNo(String... prompt){
        if (prompt.length > 0) { System.out.print("Want a boolean? (y/n): "); }
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
        try{
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("That wasn't a number...");
            return (prompt.length > 0) ? getInt("prompt") : getInt();
        }
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
        try{
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            System.out.println("That wasn't a double...");
            return (prompt.length > 0) ? getDouble("prompt") : getDouble();
        }
    }

    public static void clear() {
        scanner.nextLine();
    }
}
