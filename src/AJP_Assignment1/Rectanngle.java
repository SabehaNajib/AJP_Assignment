package AJP_Assignment1;

public class Rectanngle {
    public int length;
    public int width;

    public Rectanngle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }
}
class print{
    public static void main(String[] args){
        Rectanngle rectangle = new Rectanngle(5,4);
        System.out.println("Area of a Rectangle: "+rectangle.area());
    }
}

