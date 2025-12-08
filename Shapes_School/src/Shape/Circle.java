package Shape;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1;
        color = "blue";
    }

    public Circle(double r)
    {
        this.radius = r;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}