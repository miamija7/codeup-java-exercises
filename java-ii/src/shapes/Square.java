package shapes;

public class Square extends Rectangle{
    // Variables/Fields
    protected int side;

    // Constructor
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    // Methods
    public int getArea() {
        System.out.println("...overridden area method");
        return (int)Math.pow(side, 2);
    }

    public int getPerimeter(){
        System.out.println("...overridden perimeter method");
        return side*4;
    }

}
