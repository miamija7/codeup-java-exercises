package shapes;

public class Circle {
    // Variables/Fields
    private double radius;


    // Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Methods
    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }

    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

}
