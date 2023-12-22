public class TestBook {
    public static void main(String[] args) {
        mirea__lab__1.Book b1 = new mirea__lab__1.Book("Harry Potter", "Joanne Rowling", 8);
        mirea__lab__1.Book b2 = new mirea__lab__1.Book("Alchemist", "Paulo Coelho", 5);
        mirea__lab__1.Book b3 = new mirea__lab__1.Book("Cherry garden", "Anton Chekhov", 10);
        b3.setPrice(12);
        System.out.println(b3);
        b1.bookSale();
        b2.bookSale();
        b3.bookSale();
    }
}
