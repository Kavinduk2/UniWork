package tutorial05_shapecollection;

import java.util.Scanner;


public class GeometricShapeCollection implements ShapeCollection {
    private GeometricObject [] shapeList;
    private int maxNumShape;
    private static int totalNumShape = 0;

    public GeometricShapeCollection(int listLength){
        this.maxNumShape = listLength;
        shapeList = new GeometricObject[maxNumShape];

    }

    public void addShape(GeometricObject shape){
        if(totalNumShape < maxNumShape){
            shapeList[totalNumShape] = shape;
            totalNumShape ++;
        } else{
            System.out.println("No more space in list");
        }
    }

    public void printShapeList(){
        for (int i =0; i < totalNumShape; i++){
            if(shapeList[i].getShape().equals("Circle")){
                System.out.println("Shape = Circle , Area = "+
                        shapeList[i].getArea()
                        +", Perimeter = "+
                        shapeList[i].getPerimeter());

            }else if(shapeList[i].getShape().equals("Rectangle")) {
                System.out.println("Shape = Rectangle , Area = " +
                        shapeList[i].getArea()
                        + ", Perimeter = " +
                        shapeList[i].getPerimeter());
            }else if (shapeList[i] instanceof Square) {
                System.out.println("Shape = Square , Area = " +
                        shapeList[i].getArea()
                        + ", Perimeter = " +
                        shapeList[i].getPerimeter());
            }else{
                System.out.println("Something went wrong");
            }

        }
    }

    public boolean runMenu(){
        boolean exit = false;

        System.out.println("To Add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");
        Scanner s = new Scanner (System.in);
        int choice = s.nextInt();

        switch (choice){
            case 1 :
                if (tutorial05_shapecollection.GeometricShapeCollection.totalNumShape < maxNumShape) {

                    System.out.println("Press 1 if you want to add a Circle");
                    System.out.println("Press 2 if you want to add a Rectangle");
                    System.out.println("Press 3 if you want to add a Square");

                    int choice2 = s.nextInt();
                    s.nextLine();


                    System.out.println("Enter the color of your shape");
                    String colour = s.nextLine();


                    System.out.println("Is it filled? (y/n)");
                    String isFilled = s.nextLine();


                    boolean filled = false;
                    if (isFilled.equals("y")) {
                        filled = true;
                    } else if (isFilled.equals("n")) {
                        filled = false;
                    } else {
                        filled = false; // false by default - you can improve your code adding validation on user input
                    }
                    switch (choice2) {
                        case 1:
// it is a circle
                            System.out.println("Insert the radius");
                            int radius = s.nextInt();
                            Circle c = new Circle(radius, colour, filled);
                            this.addShape(c);
                            break;
                        case 2:
                            System.out.println("Enter the length of the rectangle : ");
                            double length = s.nextDouble();
                            System.out.println("Enter the width of the rectangle : ");
                            double width = s.nextDouble();
                            Rectangle rectangle = new Rectangle(length, width, colour, filled);
                            this.addShape(rectangle);
                            break;

// write here the code if the rectangle is selected
                        case 3:
                            System.out.println("Enter the length of a side of square : ");
                            double side = s.nextDouble();
                            Square square = new Square(side, colour, filled);
                            this.addShape(square);
                            break;
                    }
                    break;
                }
            case 2:
                this.printShapeList();
                break;
            case 3:
                exit = true;
                break;
        }
        return exit;
    }

}






