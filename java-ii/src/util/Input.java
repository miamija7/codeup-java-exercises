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
    public String getString(){
        System.out.print("Gimme a string: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.print("Want a boolean? (y/n): ");
        return (this.scanner.nextLine().toLowerCase().startsWith("y"));
    }

    public int getInt(int min, int max) {
        int userInput;

        do  {
            System.out.print("Gimme an integer between " + min + " and " + max + ": ");
            userInput = this.scanner.nextInt();
        } while (userInput > max || userInput < min);

        scanner.nextLine();
        return userInput;
    }

    public int getInt() {
        System.out.print("Gimme an integer: ");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput;

        do  {
            System.out.print("Gimme a double between " + min + " and " + max + ": ");
            userInput = this.scanner.nextDouble();
        } while (userInput > max || userInput < min);

        scanner.nextLine();
        return userInput;
    }

    public double getDouble() {
        System.out.print("Gimme a double: ");
        return this.scanner.nextDouble();
    }
}
