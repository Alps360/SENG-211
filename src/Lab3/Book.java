package Lab3;
public class Book {
    String title;
    String author;
    double price;

        public Book() {
            title = " ";
            author = " ";
            price = 0;
        }

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void showDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
}
