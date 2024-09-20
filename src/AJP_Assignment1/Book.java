package AJP_Assignment1;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title){
        this.title = title;
        System.out.println("Title : "+title);
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args){
        Book book1 = new Book("It Ends With Us");
        System.out.println();
        Book book2 = new Book("It Ends With Us", "Collen Hoover");
        System.out.println();
        Book book3 = new Book("It Ends With Us", "Collen Hoover", 320);
    }
}
