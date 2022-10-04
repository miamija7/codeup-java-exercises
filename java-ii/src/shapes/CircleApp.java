package shapes;
import util.Input;
import java.lang.reflect.Array;

public class CircleApp {
    public static void main(String[] args) {
        boolean again = true;
        do {
            createNewCircle();
            again = prompt();
        } while (again);
    }

    public static void createNewCircle() {
        Input in = new Input();
        System.out.println("\n------ Creating a new circle ------");
        System.out.print("Input Circle's radius: ");

        Circle myCircle = new Circle(in.getDouble());
        System.out.printf("Area: %.2f%n", myCircle.getArea());
        System.out.printf("Circumference: %.2f%n", myCircle.getCircumference());
    }

    public static boolean prompt() {
        Input in = new Input();
        System.out.print("\nYou wanna make another Circle? (y/n) ");
        return in.yesNo();
    }
}
