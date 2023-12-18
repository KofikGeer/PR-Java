package PR_15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Модель (Kitchen)
class Kitchen {
    public String makeSandwich(String sandwichType) {
    if ("Cheeseburger".equalsIgnoreCase(sandwichType)) {
        return "Cheeseburger is ready!";
    } else if ("Hamburger".equalsIgnoreCase(sandwichType)) {
        return "Hamburger is ready!";
    } else {
        return "Unknown sandwich type";
    }
}
}


