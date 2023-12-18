package PR_4;

import PR_4.Book;

public class MBook {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "Tolstoy", 1867);
        Book b2 = new Book();

        System.out.println("b1:" + b1.getAuthor()+", "+b1.getName() + ", "+ b1.getYear());
        System.out.print("b2:" + b2.getAuthor()+", "+b2.getName() + ", "+ b2.getYear());

    }
}
