public class Author {
    private String name = "";
    private String email = "";
    private char gender = 'U';
    public Author(String n, String e, char g){
        this.name = n;
        this.email = e;
        this.gender = g;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    public String toString() {
        String post_male;
        if (this.gender=='M'){
            post_male = " (m) ";
        }
        else if (this.gender=='F') {
            post_male = " (ms) ";
        }
        else{
            post_male = " ";
        }
        return this.name+post_male+"at "+this.email;
    }
}
