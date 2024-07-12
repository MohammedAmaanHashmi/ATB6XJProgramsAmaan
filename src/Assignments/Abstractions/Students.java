package Assignments.Abstractions;

public class Students extends Book {


    public Students(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    void getDetails() {
        System.out.println(name + ", " + author + ", " + price);
    }

    public static void main(String[] args) {
        Book myBook = new Students("Harry Potter", "J.K. Rowling", 120);
        myBook.getDetails();
    }

}
