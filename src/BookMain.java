public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Art of War", "Sun Tzu", 50.00);

        b1.showDetails();
        b2.showDetails();
    }
}