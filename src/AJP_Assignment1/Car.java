package AJP_Assignment1;

public class Car {
    private String  brand;
    private String model;
    private double price;

    public Car() {
        brand = "Null";
        model = "Null";
        price = 0.0;
    }
    public Car(String  brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarInfo(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println("Car created using Default Constructor:");
        car1.displayCarInfo();

        System.out.println();

        Car car2 = new Car("Ford", "Toyota", 1040300.00);
        System.out.println("Car created using Parameterized Constructor:");
        car2.displayCarInfo();
    }

}
