package AJP_Assignment1;

public class Student_Details {
    public String name;
    public int age;
    public String grade;

    public Student_Details(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void display(){
        System.out.println("Name : "+name+", Age: "+age+", Grade: "+grade);
    }

    public static void main(String[] args){
        Student_Details s1 = new Student_Details("Zara",22,"B");
        Student_Details s2 = new Student_Details("Saby",21,"A");
        Student_Details s3 = new Student_Details("Vinit",22,"C");
        Student_Details s4 = new Student_Details("Karan",21,"A");
        System.out.println("Student Details: ");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
