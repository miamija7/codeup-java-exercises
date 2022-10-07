package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        System.out.println("====== box1 ======");
        System.out.printf("Area: %.1f%nPerimeter: %.1f%n", myShape.getArea(), myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("\n====== box2 ======");
        System.out.printf("Area: %.1f%nPerimeter: %.1f%n", myShape.getArea(), myShape.getPerimeter());
    }
}
