package AJP_Assignment1;

public class Shape {
    public double calculateArea() {
        return 0;
    }
}


// Define the Circle class as a subclass of Shape
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Define the Rectangle class as a subclass of Shape
class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {

        return width * height;
    }
}

// Define the Square class as a subclass of Shape
class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {

        return side * side;
    }
}



// Define the Main class
class mainarea {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Square square = new Square(6);
        System.out.println("Area of Square: " + square.calculateArea());

    }
}