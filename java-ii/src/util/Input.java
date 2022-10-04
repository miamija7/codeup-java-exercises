package util;
import java.util.Scanner;

public class Input {
    // Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Variables/Fields
    private Scanner scanner;

    // Methods
    public String getString(String... prompt){
        if (prompt.length > 0) { System.out.print("Gimme a string: "); }
        return this.scanner.nextLine();
    }

    public boolean yesNo(String... prompt){
        if (prompt.length > 0) { System.out.print("Want a boolean? (y/n): "); }
        return (this.scanner.nextLine().toLowerCase().startsWith("y"));
    }

    public int getInt(int min, int max, String... prompt) {
        int userInput;

        do  {
            if (prompt.length > 0) { System.out.print("Gimme an integer between " + min + " and " + max + ": "); }
            userInput = this.scanner.nextInt();
        } while (userInput > max || userInput < min);

        scanner.nextLine();
        return userInput;
    }

    public int getInt(String... prompt) {
        if (prompt.length > 0) { System.out.print("Gimme an integer: "); }
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max, String... prompt) {
        double userInput;

        do  {
            if (prompt.length > 0) { System.out.print("Gimme a double between " + min + " and " + max + ": "); }
            userInput = this.scanner.nextDouble();
        } while (userInput > max || userInput < min);

        scanner.nextLine();
        return userInput;
    }

    public double getDouble(String... prompt) {
        if (prompt.length > 0) { System.out.print("Gimme a double: "); }
        return this.scanner.nextDouble();
    }
}
