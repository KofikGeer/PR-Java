package PR_6;

public class Hound extends Dog{
    Hound() {
        super.set_name("unsetted");
        super.set_age(1);
    }

    Hound(String name, Integer age) {
        super.set_name(name);
        super.set_age(age);
    }

    void hunt() {
        System.out.println("Hound dog now hunting");
    }

    void persecute() {
        System.out.println("Hound dog now persecuting someone :)))");
    }

    public String toString() {
        System.out.println(super.toString());
        return "Dog: Hound";
    }
}
