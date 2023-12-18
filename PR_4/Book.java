package PR_4;

import java.time.Year;

public class Book {
    private String Author;
    private String Name;
    private int Year;
    public Book(String a, String n, int y){
        Author = a;
        Name = n;
        Year = y;
    }

    public Book(){
        Author = "Steve";
        Name = "PR_4.Book";
        Year = 2002;
    }
    public void setAuthor(String a){
        this.Author = a;
    }
    public void setName(String n){
        this.Name = n;
    }
    public void setYear(int y){
        this.Year = y;
    }
    public String getAuthor(){
        return Author;
    }
    public String getName(){
        return Name;
    }
    public int getYear(){
        return Year;
    }
}

