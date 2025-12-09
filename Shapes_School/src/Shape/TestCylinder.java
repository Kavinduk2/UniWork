package Shape;

public class TestCylinder {
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        Cylinder c1 = new Cylinder();
        System.out.println("Shape.Cylinder:"
                        + " radius=" + c1.getRadius()
                        + " height=" + c1.getHeight()
                        + " base area=" + c1.getArea()
                        + " volume=" + c1.getVolume());
// Declare and allocate a new instance of cylinder, specifying Height
        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Shape.Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
// Declare and allocate a new instance of cylinder specifying radius and height
        Cylinder c3 = new Cylinder(5.0, 10.0);
        System.out.println("Shape.Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());

        Cylinder c4 = new Cylinder(5.0, 10, "blue");

        System.out.println("Shape.Cylinder:"
                + " radius=" + c4.getRadius()
                + " height=" + c4.getHeight()
                + " base area=" + c4.getBaseArea()
                + " volume=" + c4.getVolume()
                + " color=" + c4.getColor()
                + " Area=" + c4.getArea()
        );


    }
}
