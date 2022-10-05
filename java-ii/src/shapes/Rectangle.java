package shapes;

public class Rectangle {
    // Variables/Fields
    protected int length;
    protected int width;

    // Constructor
    public Rectangle(int width, int length){
        this.length = length;
        this.width = width;
    }

    // Methods
    public int getArea() {
        return length * width;
    }

    public int getPerimeter(){
        return (length * 2) + (width * 2);
    }
}
