package PR_15;

public class Main {
    public static void main(String[] args) {
        Kitchen model = new Kitchen();
        SandwichView view = new SandwichView();
        SandwichController controller = new SandwichController(model, view);

        view.show();
    }
}
