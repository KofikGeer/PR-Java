package PR_15;

public class SandwichController {
    private Kitchen model;
    private SandwichView view;

    public SandwichController(Kitchen model, SandwichView view) {
        this.model = model;
        this.view = view;
        view.addController(this);
    }

    public void placeOrder(String sandwichType) {
        String sandwich = model.makeSandwich(sandwichType);
        view.showSandwich(sandwich);
    }
}
