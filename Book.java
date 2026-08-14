import java.util.*;
public class Book{
    String title;
    String author;
    double price;
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.print("Enter the price of the book: ");
        double price = sc.nextDouble();
        Book myBook = new Book();
        myBook.title = title;
        myBook.author = author;
        myBook.price = price;
        System.out.println("Book Details:");
        System.out.println("Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Price: " + myBook.price);
    }

}