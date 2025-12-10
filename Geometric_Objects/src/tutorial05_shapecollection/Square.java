package tutorial05_shapecollection;

public class Square extends GeometricObject{
    protected double side;

    public Square(){
        super();
    }

    public Square (double s){
        super();
        this.side = s;
    }

    public Square (double s, String color, boolean filled){
        super(color, filled);
        this.side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return side *side;
    }

    @Override
    public String getShape(){
        return "Square";
    }

    @Override
    public double getPerimeter(){
        return side *4;
    }

    @Override
    public String toString(){
        return "Circle that inherit from GEomatricObject";
    }


}
