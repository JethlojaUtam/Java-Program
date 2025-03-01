//Program 01
//Create a class Rectangle having instance variable length and width of type double.
//Write a method to calculate area of rectangle. Set the value of length and width using
//setValue( ) method. Define area method to calculate area. Create an object of the
//class and display the area.

public class Rectangle 
{
    private double length;
    private double width;

    public void setValue(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.setValue(5.0, 10.0); 

        double rectangleArea = myRectangle.area(); 

        System.out.println("Area of the rectangle: " + rectangleArea); 
    }
}

//run:
//Area of the rectangle: 50.0