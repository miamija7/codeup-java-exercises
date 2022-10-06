package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("====== box1 ======");
        System.out.printf("Area: %d%nPerimeter: %d%n", box1.getArea(), box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("\n====== box2 ======");
        System.out.printf("Area: %d%nPerimeter: %d%n", box2.getArea(), box2.getPerimeter());
    }
}
