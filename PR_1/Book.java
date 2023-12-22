import java.math.*;

public class Book {
        private String name;
        private String author;
        private double price;

        public Book(String n, String a, double p){
            name = n;
            author = a;
            price = p;
        }
        public Book(){
            name = "-";
            author = "no_name";
            price = 0;
        }
        public void setName(String n) {
            this.name = n;
        }
        public void setAuthor(String a) {
            this.author = a;
        }
        public void setPrice(double p) {
            this.price = p;
        }
        public String getName(){
            return this.name;
        }
        public String getAuthor() {
            return this.author;
        }
        public double getPrice() {
            return this.price;
        }
        public String toString(){
            return "Book`s name is "+this.name+", and author is "+this.author+". Price of this book is "+this.price;
        }
        public void bookSale() {
            price = price * 0.8;
            price = price * 100;
            price = price / 100;
            System.out.println("Book's price with sale is " + price + " dollars");
        }

}
