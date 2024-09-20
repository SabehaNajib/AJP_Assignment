package AJP_Assignment2;

import java.lang.String;

class Person{
    private String name;
    private int age;
    private String address;

    public void setAge(int age) {
        if(age<=0){
            System.out.println("Invalid Age");
        }
        else{
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class Encapsulation{

    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Zara");
        person1.setAge(22);
        person1.setAddress("New Delhi");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());
    }

}
